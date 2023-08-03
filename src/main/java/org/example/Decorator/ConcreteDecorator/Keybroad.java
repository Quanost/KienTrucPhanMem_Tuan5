package org.example.Decorator.ConcreteDecorator;

import org.example.Decorator.Computer;
import org.example.Decorator.ComputerDecorator;

public class Keybroad extends ComputerDecorator {
    public Keybroad(Computer computer) {
        super(computer);
    }
    public long getPrice() {
        return super.getPrice() + getPriceKeyBroad();
    }

    public long getPriceKeyBroad() {
        return 200l;
    }
}
