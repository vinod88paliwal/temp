package com.dp.singleton1;

public class EagerInitializedSingleton {

	private static EagerInitializedSingleton obj = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton(){
		
		System.out.println("private cons......");
	}
	
	public static EagerInitializedSingleton getInstance(){
		
			return  obj ; 
		  }
}
