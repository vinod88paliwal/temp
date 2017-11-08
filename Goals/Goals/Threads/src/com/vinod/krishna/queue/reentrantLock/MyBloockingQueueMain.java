package com.vinod.krishna.queue.reentrantLock;

public class MyBloockingQueueMain
{
    public static void main(String[] args)
    {
     MyBlockingQueueReentrantLock sharedq = new MyBlockingQueueReentrantLock(5);

     Thread t1 = new Thread(new Producer(sharedq));
     Thread t2 = new Thread(new Consumer(sharedq));
        
        t2.start();
        t1.start();
        
        
    }
}
