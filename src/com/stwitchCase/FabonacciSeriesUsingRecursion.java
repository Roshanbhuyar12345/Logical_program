package com.stwitchCase;

public class FabonacciSeriesUsingRecursion {
	static int a = 0, b = 1, c;

	public void fabinacciFuc(int i) {
		if (i >= 1) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
			fabinacciFuc(i - 1);
		}
	}

	public static void main(String[] args) {
		System.out.print(a + " " + b);
		FabonacciSeriesUsingRecursion obj = new FabonacciSeriesUsingRecursion();
		obj.fabinacciFuc(10);
	}

}
