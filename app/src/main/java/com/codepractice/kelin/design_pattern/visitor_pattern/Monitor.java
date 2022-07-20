package com.codepractice.kelin.design_pattern.visitor_pattern;

/**
 * FileName: Monitor
 * Author: kejun
 * Date: 4/27/22 10:23 AM
 */
public class Monitor implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
       computerPartVisitor.visit(this);
    }
}
