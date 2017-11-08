package com.vinod.basics;

public class AA {

	/*public AA(){
		System.out.println("Super");
	}*/
	
	
	int doIt(){
		
		try {
			
			System.out.println("try");
	        System.exit(0);
			return 1;
			
		} catch (Exception e) {
			System.out.println("Exception");
			return 2;
		}finally{
			System.out.println("finally");
			return 3;
		}
		
	}
	
	public static void main(String[] args) {
		AA obj = new AA();
		
		System.out.println(obj.doIt());
	}
}
