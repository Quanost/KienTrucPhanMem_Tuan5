package org.example.State;

public class ApprovedState implements State{
    @Override
    public void handleRequest() {
        System.out.println("Approved");
    }
}
