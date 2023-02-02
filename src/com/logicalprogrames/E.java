package com.logicalprogrames;

public class E {
	public static void main(String[] args) {

		// count of charechter occurence

		String str = "zzzzaaaa0aaaaaayyyyyllllflll";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a') {
				count++;
			}

		}
		System.out.println(count);
	}
}
