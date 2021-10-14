package com.threads;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Writing from main thread");
//        Thread thread= new AnotherThread();
//        thread.start();

        //Thread.sleep(1000);

//        System.out.println("Writing from main again");

//        new Thread(){
//            @Override
//            public void run(){
//                System.out.println("Writing from anonymous thread");
//            }
//        }.start();

        //anonymousThread.start();

//        Thread thread=new AnotherThread();
//        thread.start();
//        Thread thread2=new AnotherThread();
//        thread2.start();
//        Thread thread=new AnotherThread();
//        thread.setName("Another thread");
//        thread.start();
//
//        Thread thread2=new Thread("Thread 2"){
//            @Override
//            public void run(){
//                System.out.println(Thread.currentThread().getName() + " is writing");
//            }
//        };
//
//        thread2.start();
//        Runnable runnable=new RunnableThread();
//        Thread thread=new Thread(runnable,"Runnable");
//        thread.start();
//
//        Thread thread2=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Writing from anonymous runnable");
//            }
//        });
//
//        thread2.start();
        Thread customThread=new CustomThread();
        customThread.start();
        //customThread.interrupt();

        Thread anonymousThread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Writing from anonymous runnable");
                try {
                    customThread.join();
                    System.out.println("Custom thread terminated. Running again");
                } catch (InterruptedException e) {
                    System.out.println("Woken up again");
                }
            }
        });

        anonymousThread.start();
    }
}
