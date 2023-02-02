package com.logicalprogrames;

public class TravercingCharector {

	public static void main(String[] args) {
		revereStrint("roshan", 100);
	}

	public static void revereStrint(String str, int n) {
		n = n % str.length();
		if (str.length() > 2 && str.length() >= n) {
			String newSting = "";
			String st = str.substring(str.length() - n);

			String s = str.substring(0, str.length() - n);

			newSting = st + s;

			System.out.println(newSting);
		} else {
			System.out.println("please enter valid input");
		}
	}

}
