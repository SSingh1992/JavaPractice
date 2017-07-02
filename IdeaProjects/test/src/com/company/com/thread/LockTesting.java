package com.company.com.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ssingh on 6/29/17.
 */
public class LockTesting {
    private Lock lock = new ReentrantLock();
    private Condition cond = lock.newCondition();
    private Integer tester = 1;
    public void producer() throws InterruptedException {
        while(true){
            Thread.sleep(1000);
            lock.lock();
            System.out.println("Locked Producer");
            if (tester == 1){
                System.out.println("Locked and waiting - Producer");
                cond.await();
                System.out.println("After producer AWAIT");
            }
            tester = 1;
            System.out.println("Producer "+tester);
            cond.signal();
            //lock.unlock();
            //System.out.println("Producer UNLOCKED");
        }
    }
    public void consumer() throws InterruptedException {
        while(true){
            Thread.sleep(1000);
            System.out.println("1sec wait");
            lock.lock();
            System.out.println("Consumer Locked");
            if(tester == -1){
                System.out.println("locked and Consumer");
                cond.await();
                System.out.println("After consumer AWAIT");
            }
            tester = -1;
            System.out.println("consumer "+tester);
            cond.signal();
            System.out.println("consumer Signal");
            //lock.unlock();
            //System.out.println("consumer UNLOCKED");
        }
    }
}
