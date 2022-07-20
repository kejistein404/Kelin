package com.codepractice.kelin.design_pattern.visitor_pattern;

/**
 * FileName: ComputerPart
 * Author: kejun
 * Date: 4/27/22 10:21 AM
 */

//定义一个表示元素的接口

public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);

}
