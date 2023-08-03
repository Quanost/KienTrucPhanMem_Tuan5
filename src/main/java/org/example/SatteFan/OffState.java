package org.example.SatteFan;

public class OffState implements FanState{
    @Override
    public void switchOn() {
        System.out.println("Da bat quat.");
    }

    @Override
    public void switchOff() {
        System.out.println("Quat dang trong trang thai tat!!");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Khong the dieu chinh toc do khi quat dang tat");
    }
}
