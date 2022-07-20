package com.codepractice.kelin.design_pattern.bridge_pattern;

//桥接模式
public class RefinedAbstraction  extends Abstraction{

    RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    //对父类抽象部分中的方法进行扩展
    public void refinedOperation(){
        //对Abstraction中的方法扩展
    }
}
