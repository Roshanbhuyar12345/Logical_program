package com.stwitchCase;

public class Annagram {
	public static void main(String[] args) {

		String s1 = "roshan";
		String s2 = "ronsha";

//		char[] first = s1.toCharArray();
//		char[] second = s2.toCharArray();

		if (s1.length() == s2.length()) {
//			Arrays.sort(first);
//			Arrays.sort(second);
//			if (Arrays.equals(first, second)) {
//				System.out.println("String is  Annagram");
//			} else {
//				System.out.println("String is not Annagram");
//
//			}

			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {

					char firstString = s1.charAt(i);

					char secondString = s2.charAt(j);

					if (firstString == secondString) {

						s2 = s2.substring(0, j) + s2.substring(j + 1);

					}
				}
			}
			if (s2.length() == 0) {
				System.out.println("String is Annagram");

			} else {
				System.out.println("String is not Annagram");

			}

		} else {
			System.out.println("String is not Annagram");
		}

	}
}
