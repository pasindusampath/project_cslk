import os
import asyncio
from playwright.async_api import async_playwright
from bs4 import BeautifulSoup
import requests


# Function to download images from a single episode
def fetch_single_episode(episode_url, episode_number):
    headers = {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36'
    }
    
    response = requests.get(episode_url, headers=headers)
    if response.status_code != 200:
        print(f"Failed to fetch episode {episode_number}. Status code: {response.status_code}")
        return
    
    soup = BeautifulSoup(response.text, 'html.parser')
    
    # Extract image URLs
    images = [img['data-src'] for img in soup.select('.content__img.js-lazy') if 'data-src' in img.attrs]
    if not images:
        print(f"No images found for Episode {episode_number}.")
        return
    
    # Create a directory for the episode
    folder_name = f"Episode_{episode_number}"
    os.makedirs(folder_name, exist_ok=True)
    
    # Save images
    for i, img_url in enumerate(images):
        try:
            img_data = requests.get(img_url).content
            img_filename = os.path.join(folder_name, f"page_{i + 1}.jpg")
            with open(img_filename, 'wb') as img_file:
                img_file.write(img_data)
            print(f"Saved image {i + 1} for Episode {episode_number}")
        except Exception as e:
            print(f"Error saving image {i + 1} for Episode {episode_number}: {e}")


# Playwright function to fetch all episode permalinks
async def get_episode_permalinks(base_url):
    async with async_playwright() as p:
        browser = await p.chromium.launch(headless=True)
        page = await browser.new_page()
        await page.goto(base_url)
        
        # Scroll to the bottom to load all episodes
        previous_height = 0
        while True:
            await page.evaluate("window.scrollTo(0, document.body.scrollHeight);")
            await asyncio.sleep(2)  # Wait for content to load
            new_height = await page.evaluate("document.body.scrollHeight")
            if new_height == previous_height:
                break
            previous_height = new_height
        
        # Extract permalinks
        content = await page.content()
        soup = BeautifulSoup(content, 'html.parser')
        episode_links = soup.select('li.episode-list__item a.episode-item')
        permalinks = ["https://tapas.io" + link['href'] for link in episode_links if 'href' in link.attrs]
        
        await browser.close()
        return permalinks


# Main function to combine both processes
async def main():
    base_url = "https://tapas.io/series/Take-Off-BL/info"
    print("Fetching episode permalinks...")
    permalinks = await get_episode_permalinks(base_url)
    print(f"Found {len(permalinks)} episodes.")

    # Download each episode's images
    for episode_number, episode_url in enumerate(permalinks, start=1):
        print(f"Downloading images for Episode {episode_number}...")
        fetch_single_episode(episode_url, episode_number)
    print("All episodes downloaded.")


# Run the script
asyncio.run(main())
