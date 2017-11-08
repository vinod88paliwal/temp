package com.thread.threadlocal2;

public class ThreadLocal implements Runnable{

	@Override
	public void run() {
				
		System.out.println(getCount());
	}

	private int getCount() {

			int count=0;
						
			//System.out.print(Thread.currentThread().getName()+" : ");
		return ++count;
	}

	
	
}
