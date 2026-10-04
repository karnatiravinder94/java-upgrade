package com.ravi.upgrade.collections.list.level2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Level_2_intermediate_iteration_sorting_conversions_practice {
    
	record Employee(String name, int salary, String dept) {};
	
	public static void main(String[] args) {
		var employees = new ArrayList<Employee>(
					List.of(new Employee("Ravinder", 5000, "IT"), 
							new Employee("Navya", 25000, "Networking"), 
							new Employee("Anand", 30000, "Networking"),
							new Employee("Bhaskar", 10000, "HR")
							)
				);
		System.out.println("Before sorting Employees : "+employees);
		employees.sort(Comparator.comparing(Employee::dept).thenComparing(Employee::salary,Comparator.reverseOrder()));
		System.out.println("After sorting Employees : "+employees);
		
	}
}
