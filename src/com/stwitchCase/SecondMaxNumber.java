package com.stwitchCase;

public class SecondMaxNumber {
	public static void main(String[] args) {

		int[] number = { 2, 4, 5, 6, 8, 3, 18, 19, 45, 46, 5, 6, 7, 3, 2 };

		int max = number[0];
		int secondMax = number[0];

		for (int i = 0; i < number.length; i++) {

			if (number[i] > max) {
				secondMax = max;

				max = number[i];
			} else if (max < secondMax) {
				secondMax = number[i];
			}

		}
		System.out.println(secondMax);

	}
}
