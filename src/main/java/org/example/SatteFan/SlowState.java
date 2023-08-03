package org.example.SatteFan;

public class SlowState implements FanState{
    public SlowState() {
    }

    public void switchOn() {
        System.out.println("Quat da duoc bat roi");
    }

    public void switchOff() {
        System.out.println("Da tat quat");
    }

    public void adjustSpeed() {
        System.out.println("Da chuyen sang toc do quat nhanh");
    }
}
