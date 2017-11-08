package com.oops.supersub.overload;

public class OverloadMethod {

/*	void show(int i){
		System.out.println("non-static method");
	}
*/
	//method can`t be overloaded only via static
	static void show(int i){
		System.out.println("static method");
	}
}
