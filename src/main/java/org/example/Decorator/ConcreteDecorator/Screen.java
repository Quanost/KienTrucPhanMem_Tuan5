package org.example.Decorator.ConcreteDecorator;

import org.example.Decorator.Computer;
import org.example.Decorator.ComputerDecorator;

public class Screen extends ComputerDecorator {
    public Screen(Computer computer) {
        super(computer);
    }

    public long getPrice() {
        return super.getPrice() + getPriceScreen();
    }

    public long getPriceScreen() {
        return 400l;
    }
}
