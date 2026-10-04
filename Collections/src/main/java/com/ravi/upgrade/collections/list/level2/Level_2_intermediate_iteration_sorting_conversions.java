package com.ravi.upgrade.collections.list.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Level_2_intermediate_iteration_sorting_conversions {

	public static void iterateNums(List<Integer> nums) {
		System.out.println("iterateNums - start ");
		// iteration type1
		System.out.println("Iteration type 1 : ");
		for (int index = 0; index < nums.size(); index++) {
			System.out.print(nums.get(index) + " ");
		}
		System.out.println("");

		// iteration type2
		System.out.println("Iteration type 2 : ");
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println("");

		// interation type3
		System.out.println("Iteration type 3 : ");
		Iterator<Integer> numsIterator = nums.iterator();
		while (numsIterator.hasNext()) {
			System.out.print(numsIterator.next() + " ");
		}
		System.out.println("");

		// iteraation type 4
		System.out.println("Iteration type 4 :");
		ListIterator<Integer> numsListIterator = nums.listIterator(nums.size());
		while (numsListIterator.hasPrevious()) {
			System.out.print(numsListIterator.previous() + " ");
		}
		System.out.println("");

		// iteration type 5
		System.out.println("Iteration type 5 :");
		nums.forEach(num -> {
			System.out.print(num + " ");
		});
		System.out.println("iterateNums - end ");
	}
	public static void sortNums(List<Integer> nums) {
		System.out.println("sortNums - start ");
		System.out.println(" ");
		System.out.println("Before assending sorting : "+nums);
		System.out.println("");
		
		Collections.sort(nums);
		
		
		System.out.println("After assending sorting : "+nums);
		System.out.println("");
		
		
		System.out.println("Before reverse sorting : "+nums);
		System.out.println("");
		// descending sorting
		nums.sort(Comparator.reverseOrder());
		
		System.out.println("After reverse sorting : "+nums);
		System.out.println("");
		
		System.out.println("sortNums - end ");
		
	}
	public static void sortNames(List<String> names) {
		names.sort(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
		System.out.println("");
		System.out.println("Names sorting based on length : "+names);
	}
	record Employee(String name, int salary, String dept) {}
	public static void sortCustomObjects(List<Employee> employees) {
		employees.sort(Comparator.comparing(Employee:: salary).reversed().thenComparing(Employee::name));
		System.out.println(" employees : "+employees);
	}
	
	
	public static void main(String[] args) {
		// 5 ways of iterating through collection elements

//		var nums=new ArrayList<Integer>(List.of(1,2,3,4,5));
		//var nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		//iterateNums(nums);
		//sortNums(nums);
		
		// sotring another level
		//var names=new ArrayList<>(List.of("Ravi", "Navya", "Ab", "Kiran"));
		//sortNames(names);
//		var employees= new ArrayList<Employee>(List.of(new Employee("Ravi", 90000, "IT"),new Employee("Navya", 75000, "HR"),
//				new Employee("Kiran", 90000, "IT")));
//		sortCustomObjects(employees);
		
		// bulk operations
//		var bulkNums = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5));
//		var secNums= List.of(4, 5, 6);
//		
//		bulkNums.removeIf(num-> num % 2 ==0);
//		System.out.println("bulkNums : "+bulkNums);
//		bulkNums.addAll(secNums);
//		System.out.println("bulkNums : "+bulkNums);
//		bulkNums.retainAll(secNums);
//		System.out.println("bulkNums : "+bulkNums);
//		bulkNums.removeAll(List.of(5));
//		System.out.println("bulkNums : "+bulkNums);
//		bulkNums.replaceAll(num -> num*10);
//		System.out.println("bulkNums : "+bulkNums);
		
		// coversions
		List<String> list = List.of("Ravi", "Navya", "Kiran");
		String[] arr= list.toArray(new String[0]); //I want a String[]
		System.out.println("arr "+arr);
		var listFromArrat=Arrays.asList(arr);
		System.out.println(" listFromArrat "+listFromArrat);
		var immuList=List.of("Ravinder","Navyak");
		System.out.println(" immuList "+immuList);
		
	}

}
