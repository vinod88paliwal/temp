package com.vinod.singleton;

public class SingletonWithVolatileVariable {

	/**
	 * Java program to demonstrate where to use Volatile keyword in Java.
	 * In this example Singleton Instance is declared as volatile variable to ensure
	 * every thread see updated value for _instance.
	 *
	 * @author Javin Paul
	 */
	private static volatile SingletonWithVolatileVariable _instance; //volatile variable

	public static SingletonWithVolatileVariable getInstance(){

	   if(_instance == null){
	            synchronized(SingletonWithVolatileVariable.class){
	              if(_instance == null)
	              _instance = new SingletonWithVolatileVariable();
	            }

	   }
	   return _instance;

	
	}	
}
