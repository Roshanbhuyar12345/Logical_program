package com.logicalprogrames;

public class B {

	public static void main(String[] args) {

		String s = "what  is spring boot ";

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);

		String ss = s.replaceAll(" ", "");
		System.out.println(ss.length());
	}

}
