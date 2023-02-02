package com.stwitchCase;

import java.util.ArrayList;

public class EvenNumberInList {
	public static void main(String[] args) {

		int arr[] = { 2, 1, 3, 4, 5, 6, 34, 5, 76, 54, 32 };

		ArrayList<Integer> evenList = new ArrayList<>();
		ArrayList<Integer> oddList = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenList.add(arr[i]);
			} else {
				oddList.add(arr[i]);
			}

		}

		for (int even : evenList) {
			System.out.println("Even number in list " + " " + even + " ");
		}
		for (int odd : oddList) {
			System.out.println("Odd number in list " + " " + odd + " ");
		}
	}
}
