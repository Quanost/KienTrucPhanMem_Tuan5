package org.example.GitSate;

public class PushState implements GitState{
    @Override
    public void doAction(GitContext context) {
        if (context.canPush()) {
            System.out.println("Changes pushed to remote repository.");
            context.setState(this);
        } else {
            System.out.println("Cannot push. Please commit changes first.");
        }
    }
}
