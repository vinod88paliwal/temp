package com.vinod.exception;

public class Test {

	int show() {

		try {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally{
				return 3;
		}
	}

	public static void main(String[] args) {

		Test obj = new Test();

		System.out.println(obj.show());
	}

}
