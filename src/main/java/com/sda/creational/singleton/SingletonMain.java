package com.sda.creational.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        SingletonLazyExample firstsingletonLazyExample = SingletonLazyExample.getInstance();
        SingletonLazyExample secondsingletonLazyExample = SingletonLazyExample.getInstance();
    }
}
