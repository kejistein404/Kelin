package com.codepractice.kelin.design_pattern.adapter_pattern.class_pattern;


//定义具体使用目标类，并通过Adapter类调用所需要的方法从而实现目标
public class AdapterPattern {

    AdapterPattern(){
        Target mAdapter = new Adapter();
        mAdapter.Request();
    }
}
