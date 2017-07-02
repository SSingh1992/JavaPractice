package com.company.com.thread;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ssingh on 6/29/17.
 */
public class LockExample {

    ArrayList<Integer> list = new ArrayList<Integer>(10);
    private Object lock1 = new Object();

    public void producer() throws InterruptedException {
        Random rm = new Random();
        while(true){
            //Thread.sleep(10);
            synchronized(lock1) {
                System.out.println(list.size());
                if(list.size() == 10){
                    lock1.wait();
                }
                if (list.size() == 0) {
                    for (int i = 0; i < 10; i++) {
                        if (list.add(rm.nextInt(10))) {
                            System.out.println("added " + list);
                        }
                    }
                }
                lock1.notify();
            }
        }
    }
    public void consumer() throws InterruptedException {
        while(true){
            System.out.println("In consumer block");
            synchronized (lock1){
                if(list.isEmpty()){
                    System.out.println("Is empty in consumer");
                    lock1.wait();
                }
                System.out.println("In sync " +list.size());
                if(list.size() == 10){
                    list.clear();
                    System.out.println("Cleared");
                }
                lock1.notify();
            }
        }
    }
}


