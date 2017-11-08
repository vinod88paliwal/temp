package com.vinod.basics;

public class NestedClassWithClassAndInterface {

	private static class innerClass {} //end of innerClass
	private interface innerInterface {
		
		class innerClass1 {
			interface innerInterface1 { } //end of innerInterface1
			
		} //end of innerClass1
	} //end of innerInterface
} //end of NestedClassWithClassAndInterface 
