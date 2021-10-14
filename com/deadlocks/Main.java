package com.deadlocks;

public class Main {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }

    private static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1 acquired lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 1 is waiting for lock2");
                synchronized (lock2){
                    System.out.println("Thread 1 has acquired lock2 and lock1");
                }
                System.out.println("Thread 1 released lock2");
            }
            System.out.println("Thread 1 released lock1");
        }
    }

    private static class Thread2 extends Thread {
        @Override
        public void run() {
            synchronized (lock1){
                System.out.println("Thread 2 acquired lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 waiting for lock2");
                synchronized (lock2){
                    System.out.println("Thread 2 acquired lock1 and lock2");
                }
                System.out.println("Thread 2 released lock2");
            }
            System.out.println("Thread 2 released lock1");
        }
    }
}
