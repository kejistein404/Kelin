package com.codepractice.kelin.design_pattern.visitor_pattern;

/**
 * FileName: Mouse
 * Author: kejun
 * Date: 4/27/22 10:24 AM
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
