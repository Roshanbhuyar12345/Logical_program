package com.logicalprogrames;

public class ReverseSentence {
	public static void main(String[] args) {

		String str = "roshan is good person";

		// char[] ch = str.toCharArray();

		String a[] = str.split(" ");
		String rev = "";
		for (int i = a.length - 1; i >= 0; i--) {
			rev = rev + a[i] + " ";
		}
		System.out.println(rev);

//		for (int i = 0; i < ch.length; i++) {
//
//			int k = i;
//
//			while (ch.length < 2 && ch[i] != ' ') {
//				i++;
//				char temp = ch[k];
//				ch[k] = ch[i - 1];
//				ch[i - 1] = temp;
//
//			}
//
//		}
//		System.out.print(ch);

	}

}
