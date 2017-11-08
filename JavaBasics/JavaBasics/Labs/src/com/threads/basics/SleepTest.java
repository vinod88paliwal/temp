package com.threads.basics;

public class SleepTest {
    
    public static void main(String... args){
           System.out.println(Thread.currentThread().getName() + " is going to sleep for 1 Second");
           try {
                  Thread.currentThread().sleep(1000);
           } catch (InterruptedException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
           }
           
      // below .. just testing wait() method     
           /*SleepTest obj = new SleepTest();
           try {
			obj.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
           System.out.println("Main Thread is woken now");
    }

}