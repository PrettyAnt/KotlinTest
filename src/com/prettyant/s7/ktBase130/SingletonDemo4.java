package com.prettyant.s7.ktBase130;

//4.懒汉式的实现   Java 版本
public class SingletonDemo4 {
    private volatile static SingletonDemo4 instance;

    private SingletonDemo4() {

    }

    public static SingletonDemo4 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo4.class) {
                if (instance == null) {
                    instance = new SingletonDemo4();
                }
            }
        }
        return instance;
    }

    public void show() {
        System.out.println("show");
    }

    public static void main(String[] args) {
        SingletonDemo4.getInstance().show();
    }
}
