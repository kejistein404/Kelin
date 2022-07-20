package com.codepractice.kelin.design_pattern.phototype_pattern;

/**
 * FileName: Square
 * Author: kejun
 * Date: 7/14/22 4:24 PM
 */
public class Square extends Shape{

    public Square() {
      type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
