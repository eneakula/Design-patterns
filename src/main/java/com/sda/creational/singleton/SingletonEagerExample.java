package com.sda.creational.singleton;

public class SingletonEagerExample {

    private static SingletonEagerExample instance = new SingletonEagerExample();
    public static SingletonEagerExample getInstance() {
        return instance;
    }

}
