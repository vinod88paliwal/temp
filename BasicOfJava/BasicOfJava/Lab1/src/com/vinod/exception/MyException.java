package com.vinod.exception;

public class MyException extends Exception 
{
	private int detail;
	MyException(int a)
	{
		detail =a;		
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "MyExceptionDtail: "+detail;
}
}
