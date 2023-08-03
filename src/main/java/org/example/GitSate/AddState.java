package org.example.GitSate;

public class AddState implements GitState{
    public void doAction(GitContext context) {
        System.out.println("Files added to staging area.");
        context.setState(this);
    }
}
