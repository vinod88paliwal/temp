package com.dp.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTest {
		
public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
	
	SingletonForSingleThread obj = SingletonForSingleThread.getInstance();
	
	/*Class<SingletonForSingleThread> cls  = SingletonForSingleThread.class;
	
	Constructor<SingletonForSingleThread> cons =	cls.getDeclaredConstructor();*/
	
								//or
	Constructor<SingletonForSingleThread> cons = SingletonForSingleThread.class.getDeclaredConstructor();
		
	  SingletonForSingleThread reflectionObj=   (SingletonForSingleThread) cons.newInstance();
	  
	System.out.println("Check : "+reflectionObj.getClass().equals(obj));
}
}
