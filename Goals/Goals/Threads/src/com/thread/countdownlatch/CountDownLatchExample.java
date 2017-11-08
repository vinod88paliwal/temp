package com.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

	//Runnable task for each thread
    private static class Task implements Runnable {

    	private CountDownLatch latch;
    	
		public Task(CountDownLatch latch) {
			this.latch = latch;
		}

		@Override
		public void run() {

		System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
			try {
				latch.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally{
				
				latch.countDown();
			}
		System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
		}
	
}
    public static void main(String[] args) {
	
    	final CountDownLatch countdownlatch = new CountDownLatch(3);
    	
    	//starting each of thread
        Thread t1 = new Thread(new Task(countdownlatch), "Thread 1");
        Thread t2 = new Thread(new Task(countdownlatch), "Thread 2");
        Thread t3 = new Thread(new Task(countdownlatch), "Thread 3");

        t1.start();
        t2.start();
        t3.start();
	}
}
