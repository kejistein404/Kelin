package com.codepractice.kelin.design_pattern.singleton_pattern;

//线程安全的懒汉单例
public class Singleton2 {

    private static Singleton2 singleton2;

    private Singleton2() {
        System.out.println("init-----");
    }

    //只是在普通懒汉模式的基础上，在getInstance()方法 加上了synchronzied，任何时候只有一个线程访问 getInstance, 但是在并发量较高的情况下，效率较低
    public static synchronized Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

}
