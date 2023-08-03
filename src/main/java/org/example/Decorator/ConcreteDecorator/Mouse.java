package org.example.Decorator.ConcreteDecorator;

import org.example.Decorator.Computer;
import org.example.Decorator.ComputerDecorator;

public class Mouse extends ComputerDecorator {
    public Mouse(Computer computer) {
        super(computer);
    }
    public long getPrice() {
        return super.getPrice() + getPriceMouse();
    }

    public long getPriceMouse() {
        return 300l;
    }

}
