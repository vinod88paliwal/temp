package com.yogesh;

public class ExceptionDemo {

	
	static int i=0;
	public static int a(){
		try{
			i=1;
			return 1;
		}
		catch(ArithmeticException ar){
			i =2;
			return 2;
		}
		finally{
			i =3;
			return 3;
		}
	}
	

	
	public static void main(String[] args) {
	 
	System.out.println(ExceptionDemo.a());
		
	}

}
