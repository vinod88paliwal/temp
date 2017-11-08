package com.vinod.singleton;

public class MainCLass {

	
	public static void main(String[] args) {
		
		Singleton obj = Singleton.getInstance();
		obj.show();
/*
		Singleton obj1 =  Singleton.getInstance();
		Singleton obj2 =  Singleton.getInstance();
	
	System.out.println(obj1.hashCode());
	System.out.println(obj2.hashCode());
	
	try {
		Object obj3 = obj.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	
*/	
	}
	
	
	
}
