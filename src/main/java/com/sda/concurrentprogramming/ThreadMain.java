package com.sda.concurrentprogramming;

public class ThreadMain {

    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        firstThread.start();
        secondThread.start();
    }
}
