package com.codepractice.kelin.design_pattern.decorator_pattern;

/**
 * FileName: DecoratorShape
 * Author: kejun
 * Date: 4/27/22 10:48 AM
 */

//创建实现了Shape接口的抽象装饰类
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape){
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
