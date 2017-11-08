package com.gk3;

public class ImmutableLab {

	public static void main(String[] args) 
	{
		
		StringBuffer sb = new StringBuffer("Old String");
		System.out.println(sb);

		
		
		sb.replace(1,3,"New Value");
		System.out.println(sb);
		
		
		
		
		/*
		String str = new String("Old String");
		System.out.println(str);
		
		str = new String("New String");	
		
		System.out.println(str);
		
		*/
		/*
		String str = "New";
		System.out.println(str);
		
		str.replace("New ", "Hello");
		System.out.println(str);
		
	*/
		
		/*String str = "Hello";
		System.out.println(str);
		
		str.replaceAll("Hello","New");
		System.out.println(str);
		*/
	
		/*String str = new String("Old String");
		System.out.println(str);
		
		str.replaceAll("Old String","old");
		
		System.out.println(str);*/
		
	}
}
