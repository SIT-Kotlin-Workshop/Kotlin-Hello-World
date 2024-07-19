Test project
============

Test project to check if your Kotlin environment is set up correctly.

Instructions
------------

* Clone this project with `git` or download it as `.zip` and extract it.
* **Install IntelliJ IDEA CE:**
    - Open https://www.jetbrains.com/idea/download
    - Pick the tab for your operating system.
    - Scroll down to IntelliJ IDEA Community Edition (which is the free version) and download the installer.
    - Run the installation.
      (You can leave all checkboxes unchecked if you want.)
    - Open IntelliJ, confirm the license.
* **Open the project:**
    - Open the folder this file is in as a project in IntelliJ.
    - Trust the project when IntelliJ asks you to.
* IntelliJ will automatically download the JDK (Java development kit) and set up everything.
  This may take few minutes.
* Afterwards, you can find inside the explorer pane on the left hand side the
  file `src > main > kotlin > HelloWorld.kt`.
* In the main part of the IDE, next to the line `private fun main()` you should see a green arrow. If you click it and
  select Run, a terminal output with `Hello, world!` should appear.

You can also try out the included Gradle task `build` (on the top right in IntelliJ).

If the automatic download of the JDK does not work (You will get an error message like "JDK not selected"),
please proceed as follows:

* In the menu, select `File > Project structure`
* In the navigation pane, select `Project`
* In the `SDK` dropdown, select `Download JDK`
* Select Version `21` and Vendor `Amazon Coretto`
* Click download and try again!

If you can't get your setup to work, we will of course help you at the workshop.

