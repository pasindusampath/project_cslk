import os
import subprocess

# Define keystore details
KEYSTORE = "sample.jks"
KEY_PASS = "sample password"  # Change as needed

# Get list of APK files in the current directory
apk_files = [f for f in os.listdir() if f.endswith(".apk")]

if not apk_files:
    print("No APK files found in the current directory.")
    exit(1)

for apk in apk_files:
    print(f"\n🔹 Signing: {apk}")

    # Build the apksigner command
    command = f'apksigner sign --ks "{KEYSTORE}" --ks-pass pass:{KEY_PASS} "{apk}"'

    # Run the command and display output
    process = subprocess.Popen(command, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True, shell=True)

    for line in process.stdout:
        print(line, end="")

    for line in process.stderr:
        print(line, end="")

    process.wait()
    if process.returncode == 0:
        print(f"✅ Successfully signed: {apk}")
    else:
        print(f"❌ Failed to sign: {apk}")

print("\n🎉 All APKs processed!")
