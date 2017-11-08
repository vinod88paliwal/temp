package com.vinod.basics;

public class TryCatchFinallyWithExit {

	public static void main(String[] args) {
	
		
		try {
			
			System.out.println("1");
			System.exit(0);
			throw new Exception();
      	//	System.out.println("2"); all code after explicitly throwing exception will be unreachable.
			
		} catch (Exception e) {
			System.out.println("3");
		}finally{
			System.out.println("4");
			
		}
		
	}

}
