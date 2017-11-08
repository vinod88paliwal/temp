package com.vinod.temp;

public class JVM32OR64 {

	public static void main(String[] args) {
		
		System.out.println("JVM Bit size: " + System.getProperty("sun.arch.data.model"));
	}
	
}
