package com.codepractice.kelin.design_pattern.decorator_pattern;

/**
 * FileName: DecoratorPatternDemo
 * Author: kejun
 * Date: 4/27/22 10:57 AM
 */
public class DecoratorPatternDemo {
    public DecoratorPatternDemo() {
        Shape circle = new Circle();

        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());

        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());


        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}

