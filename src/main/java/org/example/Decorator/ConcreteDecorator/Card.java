package org.example.Decorator.ConcreteDecorator;

import org.example.Decorator.Computer;
import org.example.Decorator.ComputerDecorator;

public class Card extends ComputerDecorator {
    public Card(Computer computer) {
        super(computer);
    }

    public long getPrice() {
        return super.getPrice() + getPriceCard();
    }

    public long getPriceCard() {
        return 200l;
    }
}
