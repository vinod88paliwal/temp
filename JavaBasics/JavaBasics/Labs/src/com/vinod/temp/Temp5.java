package com.vinod.temp;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Temp5 {

public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
 //Temp4 obj = new Temp4();
	
	Class cls = Class.forName("com.vinod.temp.Temp4"); //It loads the class in the memory

	Method m[]=	cls.getDeclaredMethods();
		
	for(Method mn:m)
	{
		System.out.println(mn);
//     	System.out.println(cls.newInstance());

	 if(mn.getName().equals("show"))
	 System.out.println(mn.invoke(cls.newInstance()));
	 
	}
	}

	
}
