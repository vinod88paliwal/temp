package com.threads.producerconsumer1;

import java.util.concurrent.*;

public class ProducerConsumerPattern {

    public static void main(String args[]){
  
     //Creating shared object
     BlockingQueue<Object> sharedQueue = new LinkedBlockingQueue<Object>();
 
     //Creating Producer and Consumer Thread
     Thread prodThread = new Thread(new Producer(sharedQueue));
     Thread consThread = new Thread(new Consumer(sharedQueue));

     //Starting producer and Consumer thread
     prodThread.start();
     consThread.start();
    }
}


