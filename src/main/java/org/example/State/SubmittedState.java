package org.example.State;

public class SubmittedState implements State{
    @Override
    public void handleRequest() {
        System.out.println("Submitted");
    }
}
