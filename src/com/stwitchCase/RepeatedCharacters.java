package com.stwitchCase;

public class RepeatedCharacters {
	public static void main(String[] args) {

		String s = "suraj dada";

		int[] count = new int[225];

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;

		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				System.out.println((char) i + " : " + count[i]);

			}
		}
	}
}
