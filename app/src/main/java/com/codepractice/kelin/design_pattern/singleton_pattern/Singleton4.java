package com.codepractice.kelin.design_pattern.singleton_pattern;

//双重校验锁实现单例
public class Singleton4 {

    private  volatile static Singleton4 singleton4;

    private Singleton4() {
        System.out.println("init----");
    }

    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}


