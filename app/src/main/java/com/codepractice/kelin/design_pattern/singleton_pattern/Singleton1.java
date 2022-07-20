package com.codepractice.kelin.design_pattern.singleton_pattern;

//单例模式 懒汉
//缺点：线程不安全  在多线程的场景下可能会产生多个实例

public class Singleton1 {
    private static Singleton1 singleton1;

    private Singleton1(){
        System.out.println("初始化");
    }

    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
