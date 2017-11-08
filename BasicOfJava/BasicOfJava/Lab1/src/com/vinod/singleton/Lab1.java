package com.vinod.singleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Lab1
{
	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException
	{
		Class cls = Class.forName("com.vinod.singleton.Account"); //It loads the class in the memory
		//Method m[]=	cls.getMethods();
		Method m[]=	cls.getDeclaredMethods();
        int i=0;

		for(Method mn:m)
		{
			i++;
			System.out.println("-----"+i+"-----------");
			System.out.println(mn);
			
			System.out.println(cls.newInstance());

		 if(mn.getName().equals("getMessageOne"))
		 System.out.println(mn.invoke(cls.newInstance(),new Object[]{"vinod"}));
		 
		 
		 System.out.println();
		 System.out.println();
		 System.out.println();
		}

	}
}