package com.collections.advance;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueuePutTakeTest {
	
	public static void main(String[] args) {
	
		try {
			BlockingQueue<String> bQueue = new ArrayBlockingQueue<String>(2);
			bQueue.put("Java"); //insert object into BlockingQueue
			System.out.println("BlockingQueue after put: " + bQueue);
			bQueue.take(); //retrieve object from BlockingQueue in Java
			System.out.println("BlockingQueue after take: " + bQueue);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
