package com.example;

public class HelloApp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello from Java inside Docker V2!");
        Thread.sleep(Long.MAX_VALUE); // Keep the app running indefinitely
    }
}
