package com.vinod.exception;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class Hello4 {

	void show() throws IOException 
	{
			try {
				int i =9;
				File f = new File("sdsa");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//throw new IOException();
			
			/*
			if(f==null)
			throw new IOException();
			else
				,jbbdaskdlns
			*/
			
	}
	
	public static void main(String[] args) 
	{
	Hello4 h = new Hello4();
	
	h.show();
	/*
	try {
		h.show();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
		
    }
}
