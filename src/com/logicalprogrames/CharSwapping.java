package com.logicalprogrames;

public class CharSwapping {

	public static void main(String[] args) {

		String str = "roshan";
		String ch = "";
		int a = 2;
		for (int i = str.length() - a; i < str.length(); i++) {
			ch = ch + str.charAt(i);
		}

		for (int i = 0; i < str.length() - a; i++) {
			ch = ch + str.charAt(i);
		}
		System.out.println(ch);
	}
}
