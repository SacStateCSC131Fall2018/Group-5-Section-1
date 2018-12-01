Pirex
-----

## Git

When we use git, we don't want to publish our personal IDE project files to the repo - we only want the code.
This means that when you clone the repo, you'll need to set up your Eclipse environment around the code.
I'm going to figure out the best way to do that this weekend, so I can post some specific instructions on here to help you guys out.

### Gitignore

If you're not familiar with git, there's a file that exists in most every project called `.gitignore`.
(The `.` is important. It's there because files beginning with `.` are hidden on UNIX type operating systems,
and git was developed by Linus Torvalds while he was writing the Linux kernel.)
This file will specify every file that you _don't_ want to track in the git repo. This will include your Eclipse project files.

**Note:** I'm using IntelliJ, so I've only added IntelliJ project files to the gitignore so far.
When you create your project in Eclipse and you go to commit, it's going to want to add all of those files.
Every file that isn't in the `src` folder (other than `.gitignore`) should be added to the gitignore.

To ignore a file or folder, just add the name of that file or folder on it's own line on the gitignore.
Lines beginning with `#` are comments.
