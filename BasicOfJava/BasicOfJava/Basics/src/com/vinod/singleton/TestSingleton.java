package com.vinod.singleton;

import java.lang.reflect.*;
public class TestSingleton {
	public static void main(String[] args) throws IllegalStateException, SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException
	{
		System.out.println("Inside main(): Getting the singleton instance using getInstance()..");
		JavaSingleton s = JavaSingleton.getInstance();
		
		System.out.println("Inside main(): Trying to use reflection to get another instance...");
		Class<JavaSingleton> clazz = JavaSingleton.class;
		Constructor<JavaSingleton> cons = clazz.getDeclaredConstructor();
		cons.setAccessible(true);
		JavaSingleton s2 = cons.newInstance();
	}
}