package com.vinod.temp;

import java.util.ArrayList;

public class Temp {

	int i;
	
	
	@Override   //we should not overload equals method
	public boolean equals(Temp obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temp other = (Temp) obj;
		if (i != other.i)
			return false;
		return true;
	}

	synchronized static void show()
	{
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		
		boolean b = null == "hello";
		System.out.println(b);
		
		//Temp obj = new Temp();
		//obj.show();
		show();
		
		
		ArrayList<String> as = new ArrayList<String>();
		as.containsAll(as);
		
	}
	
}
