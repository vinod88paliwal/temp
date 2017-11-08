package com.dp.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		
		ThreadSafeSingleton obj = ThreadSafeSingleton.getInstance();
	
		ThreadSafeSingleton obj1 = ThreadSafeSingleton.getInstance();
	
		System.out.println("HashCode of obj: "+obj);
		System.out.println("HashCode of obj1: "+obj1);
		
		System.out.println("Object got created of ThreadSafeSingleton");
	}
}
