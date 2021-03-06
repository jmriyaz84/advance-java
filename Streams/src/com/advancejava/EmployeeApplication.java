package com.advancejava;

import java.util.List;

public class EmployeeApplication {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeUtil.getEmployees();
		employees.forEach(System.out::println);
		double avgSalary = employees.stream().mapToInt(Employee::getSalary).average().getAsDouble();
		int minSalary = employees.stream().mapToInt(Employee::getSalary).min().getAsInt();
		int maxSalary = employees.stream().mapToInt(Employee::getSalary).max().getAsInt();

		System.out.println("Average" + Math.round(avgSalary));
		System.out.println("Min" + minSalary);
		System.out.println("Max" + maxSalary);
	}
}
