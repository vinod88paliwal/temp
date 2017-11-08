package com.threads.basics;

public class SleepTest {
    
    @SuppressWarnings("static-access")
	public static void main(String... args){
    
    System.out.println(Thread.currentThread().getName() + " is going to sleep for 1 Second");
           try {
                  Thread.currentThread().sleep(10000);
                  
           } catch (InterruptedException e) {
                  e.printStackTrace();
           }
           
          /* try {
			Thread.currentThread().wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
*/           System.out.println("Main Thread is woken now");
    }

}