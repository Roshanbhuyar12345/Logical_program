package com.stwitchCase;

public class SwapNum {
	public static void main(String[] args) {
		int a = 11;
		int b = 22;

		a = a + b;
		b = a - b;
		b = a - b;

		System.out.println(a + " : " + b);

	}
}
