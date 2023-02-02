package com.stwitchCase;

import java.time.Duration;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		System.out.println("Enter charector of matching switch case");
		Scanner sc = new Scanner(System.in);
		String days = sc.nextLine();
		long duration = Duration.ofMinutes(1).toMillis();
		System.out.println(duration);

//		switch (days) {
//		case "s" -> System.out.println("Sunday");
//		case "m" -> System.out.println("Monday");
//		case "tu" -> System.out.println("Tuesday");
//		case "t" -> System.out.println("Tusday");
//		case "f" -> System.out.println("Frieday");
//		case "sau" -> System.out.println("Saturday");
//		case "mo" -> System.out.println("Monday");

	}

}
