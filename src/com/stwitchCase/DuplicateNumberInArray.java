package com.stwitchCase;

public class DuplicateNumberInArray {
	public static void main(String[] args) {

		int a[] = { 2, 3, 5, 6, 7, 4, 3, 4, 2 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}

			}

		}

	}
}
