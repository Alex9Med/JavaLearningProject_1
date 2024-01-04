package com.MAG.gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1  = "Execute    git stash                      - in the console.  GitStash - Stash the changes in a dirty working directory away. Use git stash when you want to record the current state of the working directory and the index, but want to go back to a clean working directory. The command saves your local modifications away and reverts the working directory to match the HEAD commit.";
        String step2  = "Perform    git checkout master            - Switch branches or restore working tree files.";
        String step3  = "Execute    git fetch                      - Download objects and refs from another repository. To see if there any changes on remote/origin";
        String step4  = "Execute    git pull                       - Fetch from and integrate with another repository or a local branch. Incorporates changes from a remote repository into the current branch.";
        String step5  = "Execute    git branch New_Branch_Name     - command to create a new branch that is same as local master. List, create, or delete branches.";
        String step6  = "Perform    git checkout New_Branch_Name   - as result we are redirected to the newly created branch.";
        String step7  = "Add the task (code) related changes in the solution";
        String step8  = "Execute    git commit                     - Record changes to the repository / to store the changes at a local level - on the current  branch.";
        String step9  = "Execute    git push                       - A new remote branch is created with origin/New_Branch_Name. Updates remote refs using local refs, while sending objects necessary to complete the given refs.";
        String step10 = "Create the pull request from Origin/New_Branch_Name into master. Pull requests let you tell others about changes you've pushed to a branch in a repository on GitHub.";
        String step11 = "Add the pull request details like name, description and reviewers.";
        String step12 = "If we collect at least 1 approval then we can     merge    the changes and continue with another task";

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
    }
}
