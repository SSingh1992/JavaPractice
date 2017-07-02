package com.company.com.thread;

/**
 * Created by ssingh on 6/29/17.
 */
public class App{
    public static void main(String args[]) throws InterruptedException {
        LockTesting le = new LockTesting();

        Thread t1 = new Thread(new Runnable(){
            public void run(){
                try {
                    le.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                try {
                    le.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }

}
