package com.stwitchCase;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {

		int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		int start = 0;
		int end = arr.length - 1;
		int target = 16;
		int mid = (start + end) / 2;
		int indexOfElement = Arrays.binarySearch(arr, target);

		System.out.println(indexOfElement);
//		while (end >= start) {
		//
//			if (target < arr[mid]) {
//				end = mid - 1;
//			} else if (start > arr[mid]) {
//				start = mid + 1;
//			} else if (arr[mid] == target) {
//				target = mid;
//				System.out.println(target);
//
//			}
//		}
	}

}
