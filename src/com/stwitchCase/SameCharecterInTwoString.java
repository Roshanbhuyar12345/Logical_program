package com.stwitchCase;

public class SameCharecterInTwoString {

	public static void main(String[] args) {

		String a = "ashu";

		String b = "bhushan";

		for (int i = 0; i < a.length(); i++) {
			// System.out.print(a.charAt(i));
			for (int j = i; j < b.length(); j++) {
				// System.err.print(b.charAt(j));
				if (a.charAt(i) == b.charAt(j)) {
					System.out.print(a.charAt(i) + " ");

				}

			}

		}

	}

}
