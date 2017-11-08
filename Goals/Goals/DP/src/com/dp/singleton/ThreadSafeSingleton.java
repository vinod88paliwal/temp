package com.dp.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	public static ThreadSafeSingleton getInstance() {

		synchronized(ThreadSafeSingleton.class) {

			if (instance == null) {
				System.out.println("Instance creation in progress...");
				instance = new ThreadSafeSingleton();
			}
			return instance;
		}
	}
}
