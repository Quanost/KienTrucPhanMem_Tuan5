package org.example.DecoratorShape;

public abstract class ShapeDecorator implements Shape{
    protected Shape decoratorShape;
    public ShapeDecorator(Shape decoratorShape) {
        super();
        this.decoratorShape = decoratorShape;
    }
}
