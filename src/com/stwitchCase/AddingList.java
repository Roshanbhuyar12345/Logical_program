package com.stwitchCase;

import java.util.ArrayList;
import java.util.Collections;

public class AddingList {
	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> newList = new ArrayList<>();

		list1.add(1);
		list1.add(3);
		list1.add(4);

		list2.add(1);
		list2.add(2);
		list2.add(4);

		for (int i = 0; i < list1.size(); i++) {
			newList.add(list1.get(i));
		}
		for (int i = 0; i < list2.size(); i++) {
			newList.add(list2.get(i));
		}

		Collections.sort(newList);
		System.out.println(newList);

	}
}
