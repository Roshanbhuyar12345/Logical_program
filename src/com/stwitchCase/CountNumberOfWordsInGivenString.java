package com.stwitchCase;

import java.util.HashMap;

public class CountNumberOfWordsInGivenString {

	public static void main(String[] args) {

		String s = "shubham shubham Java is very easy language from is so so much decade";
		String words[] = s.split(" ");
		HashMap<String, Integer> hashMap = new HashMap<>();

		for (String word : words) {

			Integer count = hashMap.get(word);

			if (count == null) {
				hashMap.put(word, 1);
			} else {
				hashMap.put(word, count + 1);
			}
		}
		System.out.println(hashMap);

	}

//		String ch[] = s.split(" ");
//
//		int count;
//
//		for (int i = 0; i < ch.length; i++) {
//			count = 1;
//			for (int j = i + 1; j < ch.length; j++) {
//
//				if (ch[i].equals(ch[j])) {
//					count++;
//				}
//
//			}
//			if (count >= 1) {
//				System.out.println(ch[i] + " : " + count);
//			}
//
//		}

}
