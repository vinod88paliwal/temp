package com.vinod.singleton;

import java.lang.annotation.Documented;

public class Account 
{
	private Account(){}
	
	@Deprecated
	public String getMessageOne(String msg)
	{
		return msg+" Welcome to world of reflection";
	}
	public String getMessageTwo(String msg)
	{
		return msg+" Welcome to world of reflection";
	}
}
