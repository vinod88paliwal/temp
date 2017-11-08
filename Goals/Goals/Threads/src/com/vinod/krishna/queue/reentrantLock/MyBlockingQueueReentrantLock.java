package com.vinod.krishna.queue.reentrantLock;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueueReentrantLock
{
    private List<Object> sharedq;

    private Lock lock = new ReentrantLock(); //or new ReentrantLock(true);-->Passing fairness param
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();

    private int capacity;
    
    public MyBlockingQueueReentrantLock(Integer capacity)
    {
        this.capacity = capacity;
        sharedq = new LinkedList<Object>();
    }

    public void put(Object i)
    {
        try
        {
        	 lock.lock();
        	while (sharedq.size() == capacity)
            {
                //try
                //{
                    notFull.await();
                //}
                
            }
            sharedq.add(i);
            notEmpty.signal(); //notEmpty.signalAll();
        }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }    
           finally
        {
            lock.unlock();
        }
    }

    
    public Object take()
    {
        lock.lock();
        try{
                while (sharedq.size() == 0)
                {
                    try
                    {
                        notEmpty.await();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                
                Object element = sharedq.remove(0);
                notFull.signal(); //notFull.signalAll();
                return element;
        }
        finally
        {
            lock.unlock();
        }
    }
}
