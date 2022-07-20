package com.codepractice.kelin.design_pattern.visitor_pattern;

/**
 * FileName: ComputerPartVisitor
 * Author: kejun
 * Date: 4/27/22 10:20 AM
 */

//创建一个表示访问者的接口
public interface ComputerPartVisitor {


    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

    void visit(Mouse mouse);

    void visit(Computer computer);
}
