package com.vinod.basics;
public class ReturnFinallyExit {
	public static void main(String[] args) {

		System.out.println(show());
	}

	private static String show() {
		try {
			System.out.println("1");
			System.exit(0);
			return "2";
			//System.exit(0); // here it show error unreachable code
		} catch (Exception e) {
		} finally {

			System.out.println("Finally");
		}
		return "3";
	}
}