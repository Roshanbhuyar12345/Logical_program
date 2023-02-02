package com.stwitchCase;

public class PallindromNumber {
	public static void main(String[] args) {

		int pallindroNumber = 34543;

		int revNumber = 0, sum = 0;

		int temp = pallindroNumber;

		while (pallindroNumber > 0) {

			revNumber = pallindroNumber % 10;

			sum = sum * 10 + revNumber;

			pallindroNumber = pallindroNumber / 10;

		}
		if (sum == temp) {
			System.out.println("Number is pallindrom");
		} else {
			System.out.println("Number is not pallindrom");

		}

	}
}
