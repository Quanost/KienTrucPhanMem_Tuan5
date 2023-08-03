package org.example.Decorator;

public abstract class ComputerDecorator implements Computer{

    protected Computer computer;

    public ComputerDecorator(Computer computer){
        this.computer=computer;
    }

    @Override
    public long getPrice() {
        return computer.getPrice();
    }
}
