package com.logicalprogrames;

public class ReplacingString {
	public static void main(String[] args) {

		String s = "Test";
		System.out.println(s.replace('T', 'P'));

		String str = "java is good language";
		String rep = str.replaceAll("java", "Scala");
		System.out.println(rep);

	}
}
