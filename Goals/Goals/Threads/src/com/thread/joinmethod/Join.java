package com.thread.joinmethod;

import java.util.logging.*;

public class Join {
	 
    public static void main(String args[]) throws InterruptedException{
     
        System.out.println(Thread.currentThread().getName() + " is Started..!!!");
     
        Thread exampleThread = new Thread(){
            public void run(){
                try {
                    System.out.println(Thread.currentThread().getName() + " is Started");
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " is Completed");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Join.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
     
        exampleThread.start();
        exampleThread.join();
     
        System.out.println(Thread.currentThread().getName() + " is Completed..!!!");
    }
 
}

