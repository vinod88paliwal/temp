package com.vinod.exception;

import javax.swing.JOptionPane;

public class Example11{

	static void compute (int a) throws MyException
	{

	System.out.println("called compute: "+a);
	
           if(a>10)
		   throw new MyException(a);

	System.out.println("normal exit");
	}

public static void main(String args[]) {
	
int num = Integer.parseInt(JOptionPane.showInputDialog("Enter no.greater than 10"));

   try{ 
	   compute(num);
	} catch (MyException e)
	{
		System.out.println("caught  "+e);
	}
}
}
