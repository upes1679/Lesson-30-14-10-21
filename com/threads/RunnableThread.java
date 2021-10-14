package com.threads;

public class RunnableThread implements Runnable{
    @Override
    public void run(){
        System.out.println("Writing from runnable");
    }
}
