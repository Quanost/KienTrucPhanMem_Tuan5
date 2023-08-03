package org.example.SatteFan;

public class Fan {
    private FanState currentState;

    public Fan() {
        currentState = new OffState();
    }

    public void setState(FanState state) {
        currentState = state;
    }

    public void switchOn() {
        currentState.switchOn();
    }

    public void switchOff() {
        currentState.switchOff();
    }

    public void adjustSpeed() {
        currentState.adjustSpeed();
    }
}
