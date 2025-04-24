import os
import subprocess

# Define zipalign command (Ensure zipalign is available in PATH)
ZIPALIGN = "zipalign"

# Get list of APK files in the current directory
apk_files = [f for f in os.listdir() if f.endswith(".apk")]

if not apk_files:
    print("No APK files found in the current directory.")
    exit(1)

for apk in apk_files:
    print(f"\n🔹 Zipaligning: {apk}")

    # Build the zipalign command
    command = f'{ZIPALIGN} -c -P 16 -v 4 "{apk}"'

    # Run the command and display output
    process = subprocess.Popen(command, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True, shell=True)

    for line in process.stdout:
        print(line, end="")

    for line in process.stderr:
        print(line, end="")

    process.wait()
    if process.returncode == 0:
        print(f"✅ Zipaligned: {apk}")
    else:
        print(f"❌ Failed to zipalign: {apk}")

print("\n🎉 All APKs processed!")
