package com.threads.producerconsumer1;

import java.util.concurrent.*;
import java.util.logging.*;

class Consumer implements Runnable{

    private final BlockingQueue<Object> sharedQueue;

    public Consumer (BlockingQueue<Object> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
  
    @Override
    public void run() {
        while(true){
            try {
                System.out.println("Consumed: "+ sharedQueue.take());
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
  
  
}


