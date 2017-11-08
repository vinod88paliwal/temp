package com.vinod.singleton;

public class JavaSingleton {
	private static final JavaSingleton INSTANCE = new JavaSingleton();

	private JavaSingleton() {
		if (INSTANCE != null) {
			throw new IllegalStateException(
					"Inside JavaSingleton(): JavaSingleton instance already created.");
		}
		System.out.println("Inside JavaSingleton(): Singleton instance is being created.");
	}

	public static final JavaSingleton getInstance() {
		return INSTANCE;
	}
}