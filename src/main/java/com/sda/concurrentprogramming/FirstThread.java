package com.sda.concurrentprogramming;

public class FirstThread extends Thread {

    @Override
    public void run() {
        System.out.println("First thread!");
    }
}