package com.codepractice.kelin.design_pattern.visitor_pattern;

/**
 * FileName: VisitorPatternDemo
 * Author: kejun
 * Date: 4/27/22 10:35 AM
 */
public class VisitorPatternDemo {

    public VisitorPatternDemo() {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}

