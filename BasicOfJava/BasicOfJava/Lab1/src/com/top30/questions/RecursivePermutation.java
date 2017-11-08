package com.top30.questions;

public class RecursivePermutation {
	public static void main(String[] args) {
		String str = "abc";
		permute(str);
	}

	public static void permute(String str) {
		permute(str.toCharArray(), 0, str.length() - 1);
	}
	private static void permute(char[] str, int low, int high) {
		System.out.println(str);
		if (low > high)
			return;
		for (int i = low; i <= high; i++) {
			char[] x = charArrayWithSwappedChars(str, low, i);
			permute(x, low + 1, high);
		}
	}
	private static char[] charArrayWithSwappedChars(char[] str, int a, int b) {
		char[] array = str.clone();
		char c = array[a];
		array[a] = array[b];
		array[b] = c;
		return array;
	}
}