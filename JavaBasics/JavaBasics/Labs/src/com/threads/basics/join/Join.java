package com.threads.basics.join;

public class Join {
	 
    public static void main(String args[]) throws InterruptedException{
     
        System.out.println(Thread.currentThread().getName() + " is Started");
     
        Thread exampleThread = new Thread(){
        	
            public void run(){
                try {
                    System.out.println(Thread.currentThread().getName() + " is Started..!!");
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " is Completed..!!");
            
                } catch (InterruptedException ex) {
                	System.out.println(ex);
                }
            }
        };
    
Thread exampleThread1 = new Thread(){
        	
            public void run(){
                try {
                    System.out.println(Thread.currentThread().getName() + " is Started..!!!");
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " is Completed..!!!");
            
                } catch (InterruptedException ex) {
                	System.out.println(ex);
                }
            }
        };
		exampleThread.start();
        exampleThread.join();
		exampleThread1.start();
        exampleThread1.join();
        
        
        System.out.println(Thread.currentThread().getName() + " is Completed");
    }
 
}