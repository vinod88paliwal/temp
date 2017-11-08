package com.vinod.exception;

import java.sql.SQLException;

public class Hello1 {

	void show() {
		int[] i = new int[10];
		try {

			i[34] = 99;
			System.out.println("hello dear");
			System.out.println("hello dear11111");

		} catch (ArrayIndexOutOfBoundsException e) {
			i[1] = 99;
			System.out.println("ArrayIndexOutOfBoundsException here");
		} catch (Exception e) {
			i[1] = 99;
			System.out.println("Exception here");
		}

		System.out.println("Outside try catch");
	}

	public static void main(String[] args) {

		Hello1 h = new Hello1();
		h.show();

	}

}
