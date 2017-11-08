package com.top30.questions;

public class RemoveCharacterFromString {

	public static void main(String[] args) {
		// System.out.println(removeCharInString("My name is rampravesh kumara",'a'));
		System.out.println(removeCharInString("922374982 032492", '2'));
	}
	public static String removeCharInString(String str, char charToBeRemoved) {
		if (str == null)
			return "";

		// StringBuilder strBuild = new StringBuilder();
		String strBuild = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == charToBeRemoved) {
				System.out.println("Continue for " + ch);
				continue;
			}
			System.out.println("append for " + ch);
			// strBuild.append(ch);
			strBuild = strBuild + ch;
		}
		return strBuild.toString();
	}
}