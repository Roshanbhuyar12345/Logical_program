package com.logicalprogrames;

public class ReverceNumber {

	public static void main(String[] args) {

		int n = 24232525;

		int count = 0;
//
//		while (n > 0) {
//
//			if (n % 2 == 0) {
//				count++;
//			}
//			n = n / 10;
//		}
//		System.out.println(count);
		int sum = 0;
		while (n > 0) {

			int a = n % 10;

			sum = sum * 10 + a;

			n = n / 10;
		}
		System.out.println(sum);
	}

}
