package com.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAge {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "rahul", 24);
		Employee e2 = new Employee(1, "rahul", 25);
		Employee e3 = new Employee(1, "rahul", 45);
		Employee e4 = new Employee(1, "rahul", 55);
		Employee e5 = new Employee(1, "rahul", 12);
		Employee e6 = new Employee(1, "rahul", 15);
		Employee e7 = new Employee(1, "rahul", 20);
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		Integer age = list.stream().max(Comparator.comparing(Employee::getAge)).get().getAge();
		System.out.println("Using max function");
		System.out.println(age);
		// collect.forEach(System.out::println);

		List<Employee> sorted = list.stream().sorted(Comparator.comparing(Employee::getAge).reversed())
				.collect(Collectors.toList());
		System.out.println("Using sorted");
		System.out.println(sorted.get(0).getAge());

		Integer employee = list.stream().reduce((a, b) -> b.getAge() > a.getAge() ? b : a).get().getAge();
		System.out.println("Using reduce function");
		System.out.println(employee);

	}

}
