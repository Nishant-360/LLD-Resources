package org.example.FactoryDesignPattern;

public class Demo {
    public static void main(String[] args){
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape =shapeFactory.getShape("CIRCLE");
        shape.draw();

    }
}
