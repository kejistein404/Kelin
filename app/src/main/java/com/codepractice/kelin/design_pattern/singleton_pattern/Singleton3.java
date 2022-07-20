package com.codepractice.kelin.design_pattern.singleton_pattern;

//单例模式 饿汉
//线程安全 但是在类加载时初始化 可能造成不必要的内存消耗
public class Singleton3 {

    //用static修饰，只要被加载就会创建
    private static Singleton3 singleton3 = new Singleton3();

    private Singleton3(){
        System.out.println("init---");
    }

    public static Singleton3 getInstance(){
        return singleton3;
    }

}
