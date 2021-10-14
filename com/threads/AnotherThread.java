package com.threads;

public class AnotherThread extends Thread{
    @Override
    public void run(){
        System.out.println("Writing from another thread");
        System.out.println(Thread.currentThread().getName());
    }
}
