package com.threads.producerconsumer.reenterentLock;

public class MyBloockingQueueImpl
{

    public static MyBlockingQueue sharedq = new MyBlockingQueue(5);
    
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Producer(sharedq));
        Thread t2 = new Thread(new Consumer(sharedq));
        
        t2.start();
        t1.start();
        
        
    }
}
