package com.logicalprogrames;

public class StringrReverce {
	public static void main(String[] args) {

		String str = "suraj da from shreegonda";

		String a[] = str.split(" ");

		for (int i = a.length - 1; i >= 0; i--) {

			System.out.print(a[i] + " ");

		}

	}
}
