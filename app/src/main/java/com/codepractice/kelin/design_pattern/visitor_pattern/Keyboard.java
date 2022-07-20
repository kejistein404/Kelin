package com.codepractice.kelin.design_pattern.visitor_pattern;

/**
 * FileName: KeyBoard
 * Author: kejun
 * Date: 4/27/22 10:22 AM
 */

public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
