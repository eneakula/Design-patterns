package com.sda.concurrentprogramming;

public class SecondThread extends Thread {
    @Override
    public void run() {
        System.out.println("Second thread!");
    }
}