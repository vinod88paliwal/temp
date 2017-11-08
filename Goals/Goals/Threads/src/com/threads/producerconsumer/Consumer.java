package com.threads.producerconsumer;

import java.util.concurrent.BlockingQueue;
//Consumer class that will process on the messages from the queue and terminates when exit message is received.
public class Consumer implements Runnable{
 
private BlockingQueue<Message> queue;
     
    public Consumer(BlockingQueue<Message> q){
        this.queue=q;
    }
 
    @Override
    public void run() {
        try{
            Message msg;
            //consuming messages until exit message is received
            while((msg = queue.take()).getMsg() !="exit"){
            Thread.sleep(10);
            System.out.println("Consumed "+msg.getMsg());
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}