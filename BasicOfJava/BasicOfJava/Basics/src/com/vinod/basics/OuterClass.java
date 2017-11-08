package com.vinod.basics;

public class OuterClass {

 class InnerClass{

	 void cmethod(){
//Inner class object creation inside inner class inside non-static method.
			OuterClass out = new OuterClass();
			OuterClass.InnerClass in = out.new InnerClass();
		}
	}
static void amethod(){
	//Inner class object creation inside static method.
	OuterClass out = new OuterClass();
	OuterClass.InnerClass in = out.new InnerClass();
}
 void bmethod(){
	//Inner class object creation inside non-static method.
	OuterClass out = new OuterClass();
	OuterClass.InnerClass in = out.new InnerClass();
}
public static void main(String[] args) {
	//Inner class object creation inside main method.
	OuterClass out = new OuterClass();
	OuterClass.InnerClass in = out.new InnerClass();
}
}
