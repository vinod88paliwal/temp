package com.vinod.basics;

public class RuntimeClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		

		System.out.println(Runtime.getRuntime().totalMemory());

RuntimeClass obj = new RuntimeClass();
   
System.out.println(obj.hashCode());

RuntimeClass obj1=(RuntimeClass)obj.clone();

System.out.println(obj1.hashCode());
	}
	
}
