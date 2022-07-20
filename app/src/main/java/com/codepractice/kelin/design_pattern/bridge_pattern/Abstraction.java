package com.codepractice.kelin.design_pattern.bridge_pattern;

//抽象部分的实现
public abstract class Abstraction {
    private Implementor mImplementor;

    Abstraction(Implementor implementor){
        mImplementor = implementor;
    }

    public void operation(){
        mImplementor.operatorImpl();
    }

}
