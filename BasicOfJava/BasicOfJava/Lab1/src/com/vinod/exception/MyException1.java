package com.vinod.exception;

public class MyException1 extends Exception
{
	private int i;
	
	MyException1(int i)
	{
		this.i = i;
				
	}	
		
	@Override
	public String toString() {
		return "GK Exp [i=" + i + "]";
	}
	
}
