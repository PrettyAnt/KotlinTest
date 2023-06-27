package com.prettyant.s7.ktBase130;

//3.懒汉式的实现   Java 版本
public class SingletonDemo3 {
    private static SingletonDemo3 instance;

    private SingletonDemo3() {

    }

    public static synchronized SingletonDemo3 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo3();
        }
        return instance;
    }

    public void show() {
        System.out.println("show");
    }

    public static void main(String[] args) {
        SingletonDemo3.getInstance().show();
    }
}
