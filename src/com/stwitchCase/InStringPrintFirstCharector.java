package com.stwitchCase;

public class InStringPrintFirstCharector {

	public static void main(String[] args) {

		String str = "my name is roshan";

		String[] word = str.split(" ");

//		for (String c : word) {
//			System.out.print(c.charAt(0) + " ");
//		}

		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i].charAt(0) + " ");
		}

	}

}
