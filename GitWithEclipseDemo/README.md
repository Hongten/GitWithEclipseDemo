# How to create a repository in Github with Eclipse?

How to create a repository in Github with Eclipse? Here is an answer.

I will teach you how to do it step by step. Before creating your own repository in Github you need have an active account in Github.

Note: You can to go sign up if you haven't any Github account.

Here is my own eclipse version information.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)


Here we go!!!

# 1. Create a java project(e.g GitWithEclipseDemo for my demo) in your eclipse. And create some classes

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/structure.png)

# 2. Right click project -> Team -> Share Project...

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/share_project.png)

# 3. Configure Git Repository window will be displayed. Then click 'Create' button.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/configure_git_repository.png)

# 4. Click 'Browser..' button to select a folder in your PC to set repository directory. This direcory is a local git repository.

In this case, I set my repository directory is 'C:\Users\Administrator\Documents\GitHub', and click 'Finish' button.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/create_a_new_git_repository.png)

# 5.Click 'Finish' button in the Configure Git Repository window.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)
# 6.Go to Window -> Show View -> Other. Then the 'Show View' window will be displayed and to find Git section. Select 'Git Repositories' and 'Git Staging' and click 'Ok' button.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)
# 7.As step 6 to select 'History' item under Team section.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)
# 8. Right click project -> Team -> Commit..

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)
# 9. Commit Changes to Git Repository window will be displayed. Type Commit message and select files that you want to commit and click 'Commit' button to commit.

In this case, I want to commit all files under 'GitWithEclipseDemo' project

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)
# 10.Go to your own github website and click 'New' button to create a new repository in Github.

In this case, I created 'GitWithEclipseDemo' repository in my Github.


![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)
# 13.Back to eclipse and find Remotes under Git Repositories. Right click -> Create Remote...

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)
# 14. Type the name for the new remote and click 'Ok' button

In this case, I used 'demo' for my remote name.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)
# 15. Configure push for remote 'demo' window will be displayed. Click 'Change' button.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)
# 16. Copy the URL that provided by Github(Refer Step 12), and type the User and password(this user and password can login your github). Click 'Finish' button.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)
# 17. Click 'Advanced' button in the Configure push for remote 'demo' window.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)
# 18. Select 'master' for Source ref and click 'Add Spec' button.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)
# 19.A new Mode will be added after clicking 'Add Spec' button in the Step 18.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)
# 20. Find demo in the Remotes section under Git Repositories. Right click -> Push

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)
# 21.A push results  window will be displayed.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)
# 22.Go to your Github website, you can find your local sources had been pushed in Github now.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/eclipse_version.png)
End. If you do some changes in your project(e.g. change code), you can Commit and Push it into Github.

You can find this 'GitWithEclipseDemo' in my Github.

Thanks for watching.






































mp3_v2 is a mp3 player, it provides 21 skins for your choice, and it takes up less CPU resources when it running.

![Example](https://github.com/Hongten/mp3_v2/blob/master/image/cpu%20usage.png)

mp3_v2 need JDK-1.7 or above.
You can get the runable jar file [`mp3_v2.jar`](https://github.com/Hongten/mp3_v2/blob/master/jar/mp3_v2.jar?raw=true) (`8.06MB`)to run first.

# Main Panel

The main panel includes `play control buttons`(`previous`, `play/pause`, `next`), `play mode button`, `time bar` and `play list`.

![Example](https://github.com/Hongten/mp3_v2/blob/master/image/main%20panel.png)
![Example](https://github.com/Hongten/mp3_v2/blob/master/image/main%20panel_magmaSkin.png)

# Select Directory Panel

`CTRL + N` will open select directory panel to add new song.

![Example](https://github.com/Hongten/mp3_v2/blob/master/image/select%20directory%20panel.png)

# Mini Panel

`CTRL + M` will exchange `Mini`(hide the play list) or `Normal`(with the play list) panel.

![Example](https://github.com/Hongten/mp3_v2/blob/master/image/mini%20panel.png)

# File Menu Panel

File menu panel includes `Add`, `Mini`, `Change Skin`, `Play Mode Exchange`, `About Mp3 Player` and `Exit` menu.

![Example](https://github.com/Hongten/mp3_v2/blob/master/image/file%20menu%20panel.png)


# Play List Panel

You can select one song in the play list, and double left click to play or double right click to remove.

![Example](https://github.com/Hongten/mp3_v2/blob/master/image/play%20list%20panel.png)
![Example](https://github.com/Hongten/mp3_v2/blob/master/image/remove%20panel.png)

# Tray Panel

Tray panel includes `Previous`, `Next`, `Change Skin`, `Play Mode Exchange`, `Add`, `Mini`, `Restore` and `Exit` menu.

![Example](https://github.com/Hongten/mp3_v2/blob/master/image/tray%20panel.png)

# Change Skin Panel

Change skin panel includes 21 skins. The player will change skin according to your choice.

![Example](https://github.com/Hongten/mp3_v2/blob/master/image/change%20skin%20panel.png)
![Example](https://github.com/Hongten/mp3_v2/blob/master/image/change%20skin%20panel_magmaSkin.png)

# About Panel

About panel includes some information about the player and author.

![Example](https://github.com/Hongten/mp3_v2/blob/master/image/about%20panel.png)

# More Information

* Author            : Hongten
* E-mail            : [hongtenzone@foxmail.com](mailto:hongtenzone@foxmail.com)
* Home Page         : [http://www.cnblogs.com/hongten](http://www.cnblogs.com/hongten)
* Refer Skin Page   : [http://www.cnblogs.com/hongten/p/hongten_notepad_substance_skins.html](http://www.cnblogs.com/hongten/p/hongten_notepad_substance_skins.html)
* Substance URL     : [https://substance.dev.java.net/](https://substance.dev.java.net/)
