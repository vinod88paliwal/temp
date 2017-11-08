package com.dp.singleton1;

public class SingletonForSingleThread {

	private static  SingletonForSingleThread INSTANCE;
	
	private SingletonForSingleThread(){}
	
	public static SingletonForSingleThread getInstance() {
		
		if(INSTANCE ==null){
			System.out.println("Instance creation in progress...");
			INSTANCE = new SingletonForSingleThread();
		}
		return INSTANCE;
	}
	
	public void Hello()
	{
		System.out.println("Hello !!!");
	}
}
