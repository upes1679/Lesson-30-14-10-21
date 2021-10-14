package com.threads;

public class CustomThread extends Thread{
    @Override
    public void run(){
        System.out.println("Writing from custom thread");
        try {
            Thread.sleep(5000);
            System.out.println("Woken up after 5 sec");
        } catch (InterruptedException e) {
            System.out.println("Someone interrupted me while sleeping");
        }
    }
}
