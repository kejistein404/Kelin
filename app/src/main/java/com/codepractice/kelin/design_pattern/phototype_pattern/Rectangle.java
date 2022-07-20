package com.codepractice.kelin.design_pattern.phototype_pattern;

/**
 * FileName: Rectangle
 * Author: kejun
 * Date: 7/14/22 4:23 PM
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
