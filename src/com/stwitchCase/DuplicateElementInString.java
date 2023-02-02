package com.stwitchCase;

public class DuplicateElementInString {
	public static void main(String[] args) {

		String str = "Roshana";
		String lowerCase = str.toLowerCase();

		for (int i = 0; i < lowerCase.length(); i++) {
			char a = lowerCase.charAt(i);
			for (int j = i + 1; j < lowerCase.length(); j++) {
				char b = lowerCase.charAt(j);

				if (a == b) {
					System.out.println("Duplicate charector in string is " + a);
				}

			}

		}

	}
}
