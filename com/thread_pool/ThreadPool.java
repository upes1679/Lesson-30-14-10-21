package com.thread_pool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker=new WorkerThread("number "+i);
            executorService.execute(worker);
        }
        executorService.shutdown();
    }
}

class WorkerThread implements Runnable{
    private String message;
    public WorkerThread(String message){
        this.message=message;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+ ": "+this.message );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" finished");
    }
}