package com.prettyant.s7.ktBase130;

//1.饿汉式的实现   Java 版本
public class SingletonDemo {
    private static SingletonDemo instance = new SingletonDemo();

    private SingletonDemo() {

    }

    public static SingletonDemo getInstance() {
        return instance;
    }
}
