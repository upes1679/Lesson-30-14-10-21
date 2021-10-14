package com.thread_scheduling;

public class Main {
    public static void main(String[] args) {
        Thread thread=new Thread("Thread 1"){
            @Override
            public void run(){
                System.out.println("Running "+getName() + " priority: "+getPriority());
            }
        };

        Thread thread2=new Thread("Thread 2"){
            @Override
            public void run(){
                System.out.println("Running "+getName() + " priority: "+getPriority());
            }
        };

        thread.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread.start();
        thread2.start();
    }
}
