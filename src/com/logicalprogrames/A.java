package com.logicalprogrames;

//input : "zzzzaaaa0aaaaaayyyyyllllflll";
//output:  z4a401a6y5l4f1l3

public class A {

	public static void main(String[] args) {

		String str = "zzzzaaaa0aaaaaayyyyyllllflll";

		// System.out.println(str.length());

		int count = 0;
		char ccc = 'q';
		String finalStr = "";

		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				count = count + 1;
				ccc = str.charAt(i);
				System.err.println(ccc);
				System.err.println(count);

			} else if (ccc == str.charAt(i)) {
				count = count + 1;
				System.err.println(count);

			}

			else {
				finalStr = finalStr + ccc + count;
				ccc = str.charAt(i);
				count = 1;
				System.err.println("HIII1 " + finalStr);

				System.err.println("HIII " + count);

			}
		}

		finalStr = finalStr + ccc + count;

		System.out.println(finalStr);

	}

}
