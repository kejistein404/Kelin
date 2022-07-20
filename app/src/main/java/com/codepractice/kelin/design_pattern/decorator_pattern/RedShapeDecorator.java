package com.codepractice.kelin.design_pattern.decorator_pattern;

/**
 * FileName: RedShapeDecorator
 * Author: kejun
 * Date: 4/27/22 10:52 AM
 */

//创建拓展了ShapeDecorator类的实体装饰类
public class RedShapeDecorator extends ShapeDecorator {


    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        //具体要装饰的内容（内容增强）
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratorShape) {
        System.out.println("setRedBorder======");
    }

}
