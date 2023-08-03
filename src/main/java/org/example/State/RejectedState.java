package org.example.State;

public class RejectedState implements State{
    @Override
    public void handleRequest() {
        System.out.println("Rejected");
    }
}
