package com.stwitchCase;

import java.util.HashMap;

public class UsingHashMap {

	public static void main(String[] args) {

		String s = "shubham shubham Java is very easy language from is so so much decade";
		int count = 0;
		// String[] str = s.split(" ");

		HashMap<String, Integer> hashMap = new HashMap<>();

		hashMap.put(s, count++);

		System.out.println(hashMap);

	}

}
