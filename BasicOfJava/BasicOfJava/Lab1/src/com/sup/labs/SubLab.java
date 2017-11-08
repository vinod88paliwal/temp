package com.sup.labs;

public class SubLab extends SuperLab{

	int val =9;

	public SubLab()
	{
		super.showSuper();// for super class showSuper()
	System.out.println("SubLab Default");
	}
	
	
	public SubLab(int val)
	{		
		super(22);
		System.out.println("SubLab Parametrized");
	}
	
	void showSuper(){}
	void showSub()
	{
		
		//super.showSuper();// for super class showSuper()
		System.out.println("showSub()");
	}
	
	
public static void main(String[] args) 
{
	//super.showSuper(); can not use super with static context
	SubLab obj = new SubLab();
	//SubLab obj = new SubLab(10);
	obj.showSub();
	
}	
}
