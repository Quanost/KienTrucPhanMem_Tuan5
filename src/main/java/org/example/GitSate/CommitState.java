package org.example.GitSate;

public class CommitState implements GitState{
    @Override
    public void doAction(GitContext context) {
        if (context.canCommit()) {
            System.out.println("Changes committed.");
            context.setState(this);
        } else {
            System.out.println("Cannot commit. Please add files first.");
        }
    }
}
