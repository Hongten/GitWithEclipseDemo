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

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/configure_git_repository_finish.png)

# 6.Go to Window -> Show View -> Other. Then the 'Show View' window will be displayed and to find Git section. Select 'Git Repositories' and 'Git Staging' and click 'Ok' button.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/git_repositories_staging.png)

# 7.As step 6 to select 'History' item under Team section.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/team_history.png)

# 8. Right click project -> Team -> Commit..

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/commit.png)

# 9. Commit Changes to Git Repository window will be displayed. Type Commit message and select files that you want to commit and click 'Commit' button to commit.

In this case, I want to commit all files under 'GitWithEclipseDemo' project

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/commit_changes_to_git_repository.png)

# 10.Go to your own github website and click 'New' button to create a new repository in Github.

In this case, I created 'GitWithEclipseDemo' repository in my Github.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/git_new.png)

# 11. Type the Repository name and click 'Create Repository' button to create a new repository in Github.

In this case, I created 'GitWithEclipseDemo' repository in my Github.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/create_repository.png)

# 12.Copy the URL the Github provided.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/create_git_url.png)

# 13.Back to eclipse and find Remotes under Git Repositories. Right click -> Create Remote...

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/remote_create_remote1.png)

# 14. Type the name for the new remote and click 'Ok' button

In this case, I used 'demo' for my remote name.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/new_remote_demo.png)

# 15. Configure push for remote 'demo' window will be displayed. Click 'Change' button.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/configure_push.png)

# 16. Copy the URL that provided by Github(Refer Step 12), and type the User and password(this user and password can login your github). Click 'Finish' button.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/destination_git_repository.png)

# 17. Click 'Advanced' button in the Configure push for remote 'demo' window.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/configure_push_demo_advanced.png)

# 18. Select 'master' for Source ref and click 'Add Spec' button.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/push_ref_specifications.png)

# 19.A new Mode will be added after clicking 'Add Spec' button in the Step 18.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/push_ref_specifications_finish.png)

# 20. Find demo in the Remotes section under Git Repositories. Right click -> Push

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/demo_push.png)

# 21.A push results  window will be displayed.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/pushed_to_github_ok.png)

# 22.Go to your Github website, you can find your local sources had been pushed in Github now.

![Example](https://github.com/Hongten/GitWithEclipseDemo/blob/master/GitWithEclipseDemo/images/github_demo_ok.png)

End. If you do some changes in your project(e.g. change code), you can Commit and Push it into Github.

You can find this '[GitWithEclipseDemo](https://github.com/Hongten/GitWithEclipseDemo/tree/master/GitWithEclipseDemo)' in my Github.

Thanks for watching.


# More Information

* Author            : Hongten
* E-mail            : [hongtenzone@foxmail.com](mailto:hongtenzone@foxmail.com)
* Home Page         : [http://www.cnblogs.com/hongten](http://www.cnblogs.com/hongten)
