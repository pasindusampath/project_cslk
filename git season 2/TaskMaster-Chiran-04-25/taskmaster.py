import os

# Function to load tasks from a file
def load_tasks(filename="tasks.txt"):
    """Loads tasks from a file into a list."""
    if not os.path.exists(filename):
        return []  # If file does not exist, return empty list.
    with open(filename, "r") as file:
        tasks = file.readlines()
    return [task.strip() for task in tasks]  # Clean up extra whitespace from each task

# Function to save tasks to a file
def save_tasks(tasks, filename="tasks.txt"):
    """Saves the list of tasks to a file."""
    with open(filename, "w") as file:
        for task in tasks:
            file.write(f"{task}\n")

# Function to display all tasks
def display_tasks(tasks):
    """Displays all tasks with their respective number."""
    if not tasks:
        print("\nYour to-do list is currently empty!\n")
    else:
        print("\nYour To-Do List:")
        for idx, task in enumerate(tasks, 1):
            print(f"{idx}. {task}")
        print("")  # Adds a space after the list for better readability

# Function to add a task
def add_task(tasks):
    """Adds a new task to the list."""
    task = input("Enter the task you want to add: ").strip()  # Strip leading/trailing whitespace
    if task:  # Ensure task is not empty
        tasks.append(task)
        print(f"Task '{task}' has been added to your to-do list.")
    else:
        print("You cannot add an empty task.")

# Function to delete a task
def delete_task(tasks):
    """Deletes a task from the list."""
    display_tasks(tasks)
    if not tasks:
        print("No tasks to delete.\n")
        return
    try:
        task_number = int(input("Enter the number of the task you want to delete: "))
        if 1 <= task_number <= len(tasks):
            deleted_task = tasks.pop(task_number - 1)
            print(f"Task '{deleted_task}' has been deleted!")
        else:
            print("Invalid task number. Please try again.")
    except ValueError:
        print("Invalid input. Please enter a valid number.")

# Main function to handle the program flow
def main():
    print("Welcome to TaskMaster - Your To-Do List Manager!")
    tasks = load_tasks()  # Load existing tasks from file
    while True:
        print("\nTo-Do List Menu:")
        print("1. View Tasks")
        print("2. Add a Task")
        print("3. Delete a Task")
        print("4. Exit")

        try:
            choice = int(input("Choose an option (1/2/3/4): "))
            if choice == 1:
                display_tasks(tasks)
            elif choice == 2:
                add_task(tasks)
            elif choice == 3:
                delete_task(tasks)
            elif choice == 4:
                if tasks:
                    save_tasks(tasks)
                    print("Your tasks have been saved. Goodbye from TaskMaster!")
                else:
                    print("No tasks to save. Goodbye from TaskMaster!")
                break  # Exit the program
            else:
                print("Invalid option. Please choose a valid number (1-4).")
        except ValueError:
            print("Invalid input. Please enter a valid number.")

if __name__ == "__main__":
    main()
