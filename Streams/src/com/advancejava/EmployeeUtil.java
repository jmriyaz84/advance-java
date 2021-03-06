package com.advancejava;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class EmployeeUtil {

	private EmployeeUtil() {
	};

	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		IntStream.range(1, 100).forEach(id -> {
			Employee employee = new Employee(id, getRandomNo(20, 80), getRandomNo(1000, 50000));
			employees.add(employee);
		});
		return employees;
	}

	public static int getRandomNo(int lowerLimit, int upperLimit) {
		return ThreadLocalRandom.current().nextInt(lowerLimit, upperLimit);
	}

}
