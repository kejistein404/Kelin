package com.codepractice.kelin.design_pattern.singleton_pattern;

//静态内部类实现单例 线程安全
public class Singleton5 {

    private Singleton5() {
        System.out.println("init");
    }

    private static class Singleton5Holder {
        private static Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return Singleton5Holder.INSTANCE;
    }
}

