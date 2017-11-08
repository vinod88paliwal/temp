package com.threads.producerconsumer.reenterentLock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class MyBlockingQueue
{
    private Queue<Object> sharedq;
    
    private Lock lock = new ReentrantLock();
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();

    private int capacity;
    
    public MyBlockingQueue(Integer capacity)
    {
        this.capacity = capacity;
        sharedq = new LinkedList<Object>();
    }

    public void put(Object i)
    {
        lock.lock();
        try
        {
            if (sharedq.size() == capacity)
            {
                try
                {
                    notFull.await();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            sharedq.add(i);
            notEmpty.signal();
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
                while (sharedq.isEmpty())
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
                
                Object element = sharedq.remove();
                notFull.signal();
                return element;
        }
        finally
        {
            lock.unlock();
        }
    }
}