<h1 align="center"> APK Sign & Align Toolkit </h1>
A simple two-script toolkit written in Python to help signing and zipaligning multiple APK files with just a single click. Ideal for automating post-build tasks, especially in CI/CD pipelines or manual release workflows.

---

## 📚 ToC
 - 📁 [Project Structure](#-project-structure)
 - 🚀 [Use Cases](#-use-cases)
 - 🔧 [Requirements](#-requirements)
 - 🛠️ [How to Use](#%EF%B8%8F-how-to-use)
 - ✏️ [Modifying the Scripts](#%EF%B8%8F-modifying-the-scripts)
   - 🔐 [Change Keystore Info](#-change-keystore-info)
   - ⚙️ [Customize Zipalign Options](#%EF%B8%8F-customize-zipalign-options)
 
 - 🤝 [Contributions](#-contributions)
 - 📜 [License](#-license)

<br>

## 📁 Project Structure
```
.
├── align.py      # Performs zipalign on all APKs in the directory
├── sign.py       # Signs all APKs using a JKS keystore
├── sample.jks    # Your Java Keystore file (replace or rename as needed)
```

<br>

## 🚀 Use Cases
&nbsp;&nbsp;&nbsp;&nbsp;✅ Batch sign and align APKs for release builds
<br>&nbsp;&nbsp;&nbsp;&nbsp;✅ Re-sign third-party APKs after patching or modifying
<br>&nbsp;&nbsp;&nbsp;&nbsp;✅ Automate APK processing in your deployment workflow
<br>&nbsp;&nbsp;&nbsp;&nbsp;✅ QA/Dev teams verifying builds or pushing to internal testing

<br>

## 🔧 Requirements
&nbsp;&nbsp;&nbsp;&nbsp; ✅ Python 3.x
<br>&nbsp;&nbsp;&nbsp;&nbsp; ✅ zipalign (part of Android SDK build tools)
<br>&nbsp;&nbsp;&nbsp;&nbsp; ✅ apksigner (part of Android SDK)

### IMPORTANT : Make sure both zipalign and apksigner are accessible via your system's PATH.

<br>

## 🛠️ How to Use
&nbsp;&nbsp;&nbsp;&nbsp; ✅ Place your APK files and keystore in the same directory as the scripts.
<br>&nbsp;&nbsp;&nbsp;&nbsp; ✅ Edit the keystore info in sign.py
<br>&nbsp;&nbsp;&nbsp;&nbsp; ✅ Run the sign script: `python sign.py`
<br>&nbsp;&nbsp;&nbsp;&nbsp; ✅ Then run the align script: `python align.py`
<br>&nbsp;&nbsp;&nbsp;&nbsp; ✅ Or automate both with a simple shell/batch script: `python sign.py && python align.py`

<br>

## ✏️ Modifying the Scripts
### 🔐 Change Keystore Info
&nbsp;&nbsp;&nbsp;&nbsp; ✅ In sign.py, modify the following lines as per your keystore details: `KEYSTORE = "sample.jks"` and `KEY_PASS = "sample password"` for your keystore accordingly.

### ⚙️ Customize Zipalign Options
&nbsp;&nbsp;&nbsp;&nbsp; ✅ In align.py, the zipalign command is defined like this: `command = f'{ZIPALIGN} -P 16 -f -v 4 "{apk}"'`
<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; You can change the options: [refer Android Studio docs](https://developer.android.com/tools/zipalign)

<br>

## 🤝 Contributions
Feel free to fork, tweak, or enhance! Add argument parsing, error handling, UI, or CI/CD integration.

<br>

## 📜 License
[MIT License](/git%20season%201/batch-apksigner-zipalign/LICENSE) – free to use, modify, and share.


