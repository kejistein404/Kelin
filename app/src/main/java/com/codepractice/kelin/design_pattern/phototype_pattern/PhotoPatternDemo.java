package com.codepractice.kelin.design_pattern.phototype_pattern;

/**
 * FileName: PhotoPatternDemo
 * Author: kejun
 * Date: 7/14/22 4:31 PM
 */
public class PhotoPatternDemo {

    public PhotoPatternDemo() {
        //原型模式
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
