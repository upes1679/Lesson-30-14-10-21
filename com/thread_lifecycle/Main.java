package com.thread_lifecycle;

public class Main {
    public static void main(String[] args) {
        Thread thread=new Thread(){
            @Override
            public void run(){
                System.out.println("Running");
            }
        };

        System.out.println( thread.getState());
        thread.start();
        System.out.println( thread.getState());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println( thread.getState());
    }
}
