package com.logicalprogrames;

public class F {
	public static void main(String[] args) {

		int a[] = { 3, 5, 2, 5, 8, 9, 3 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				int temp = 0;
				if (a[i] < a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

					// System.out.print(temp + " ");
				}

			}
			System.out.print(a[i] + " ");

		}

	}
}
