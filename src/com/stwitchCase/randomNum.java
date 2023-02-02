package com.stwitchCase;

import java.util.ArrayList;
import java.util.Collections;

public class randomNum {
	public static void main(String[] args) {
		int a[] = { 1, 3, 4 };
		int b[] = { 1, 2, 4 };

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			list.add(b[i]);
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
