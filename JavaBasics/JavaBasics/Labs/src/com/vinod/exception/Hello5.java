package com.vinod.exception;

import java.io.File;
import java.io.IOException;

public class Hello5 {


	void show()  throws NullPointerException
	{
			/*try {
				int i =9;
				File f = new File("sdsa");
				
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		
		int i =9;
		File f = new File("sdsa");
		throw new  NullPointerException();
					
	}
	
	public static void main(String[] args) throws NullPointerException 
	{
	Hello4 h = new Hello4();
		
	throw new NullPointerException();
	/*
	try {
		h.show();
		
	} catch (NullPointerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		*/
    }

	
}
