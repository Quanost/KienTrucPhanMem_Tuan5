package org.example.SatteFan;

public class RunningState implements FanState{
    public RunningState() {
    }

    public void switchOn() {
        System.out.println("Quat da duoc bat roi");
    }

    public void switchOff() {
        System.out.println("Da tat quat");
    }

    public void adjustSpeed() {
        System.out.println("Da chuyen sang toc do quat cham");
    }
}
