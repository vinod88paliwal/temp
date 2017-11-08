package com.collections.advance;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueTest {

	public static void main(String[] args) {
		
		try {
			BlockingQueue<String> bQueue = new ArrayBlockingQueue<String>(2);
			bQueue.put("Java");
			System.out.println("Item 1 inserted into BlockingQueue");
			bQueue.put("JDK");
			System.out.println("Item 2 is inserted on BlockingQueue");
			System.out.println("Data in queue: "+bQueue);
			bQueue.put("J2SE");
			
			System.out.println("Data in queue11: "+bQueue);
			
			System.out.println("Done");
		} catch (InterruptedException e) {
					e.printStackTrace();
		}

	}
	
}
