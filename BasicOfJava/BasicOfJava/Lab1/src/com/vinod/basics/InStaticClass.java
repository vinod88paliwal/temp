package com.vinod.basics;

public class InStaticClass {

	static class InnerClas{
	void cmethod(){
	//static Inner class object creation inside inner class inside non-static method.
		InStaticClass out = new InStaticClass();
		InStaticClass.InnerClas in = new InStaticClass.InnerClas();
		}
	static void dmethod(){ //static inner class can have static methods.
	//Inner class object creation inside inner class inside static method.
		InStaticClass out = new InStaticClass();
		InStaticClass.InnerClas in = new InStaticClass.InnerClas();
	}
                          }
	static void amethod(){
		//Inner class object creation inside static method.
		InStaticClass out = new InStaticClass();
		InStaticClass.InnerClas in = new InStaticClass.InnerClas();
			}
	 void bmethod(){
		//Inner class object creation inside non-static method.
		 InStaticClass out = new InStaticClass();
			InStaticClass.InnerClas in = new InStaticClass.InnerClas();
	    }
	public static void main(String[] args) {
		//Inner class object creation inside main method.
		InStaticClass out = new InStaticClass();
		InStaticClass.InnerClas in = new InStaticClass.InnerClas();
		}
}
