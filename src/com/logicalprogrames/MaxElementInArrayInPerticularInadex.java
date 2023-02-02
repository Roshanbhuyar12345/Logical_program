package com.logicalprogrames;

public class MaxElementInArrayInPerticularInadex {
	public static void main(String[] args) {

		int arr[] = { 3, 4, 7, 33, 2, 5, 6, 3, 2, 22 };
		int initialIndex = 0;
		int lastIndex = 2;

		int maxValue = arr[0];

		for (int i = initialIndex; i <= lastIndex; i++) {

			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		System.out.println(maxValue);

	}

}