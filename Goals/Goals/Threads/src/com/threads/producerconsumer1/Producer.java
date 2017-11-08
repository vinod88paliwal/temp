package com.threads.producerconsumer1;

import java.util.concurrent.*;
import java.util.logging.*;

class Producer implements Runnable {

    private final BlockingQueue<Object> sharedQueue;

    public Producer(BlockingQueue<Object> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                System.out.println("Produced: " + i);
                sharedQueue.put(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}


