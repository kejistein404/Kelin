package com.codepractice.kelin.design_pattern.phototype_pattern;

/**
 * FileName: Circle
 * Author: kejun
 * Date: 7/14/22 4:27 PM
 */
public class Circle extends Shape{


    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
