package com.ravi.upgrade.collections.list.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

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
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		var colours= new ArrayList<>(Arrays.asList("Red","Black","White","Orange","Yellow"));
		System.out.println("Before Colours -> "+colours);
		// remove element from list based on predicate
		colours.removeIf(colour-> colour.length()<4);
		System.out.println("After Colours -> "+colours);
		
		System.out.println(" ");
		System.out.println(" ");
		
		// Find the common elements between two lists without modifying either list.
		var fullstackDevs=new ArrayList<>(Arrays.asList("Ravinder","Sai","Srihari","Venu"));
		var devOppsDevs= new ArrayList<>(Arrays.asList("Ravinder","Sai","Naresh","Venkatesh"));
		var superSkillEmployess=new ArrayList<>();
		
		fullstackDevs.forEach(fullStackDev-> {
			if(devOppsDevs.contains(fullStackDev)) {
				superSkillEmployess.add(fullStackDev);
			}
		});
		System.out.println("Superskill employess -> "+superSkillEmployess);
		System.out.println("");
		System.out.println("");
		// Iterate a list backwards using ListIterator and replace every element with its uppercase form via set().
		var nlgVillages=new ArrayList<>(Arrays.asList("Ghattuppal","Chandur","Velamakanya","Chuotuppal","Naraynpur"));
		System.out.println("Nlg Villanges  --> "+nlgVillages);
		ListIterator<String> villagesIterator= nlgVillages.listIterator(nlgVillages.size());
		while(villagesIterator.hasPrevious()) {
			villagesIterator.set(villagesIterator.previous().toUpperCase());
		}
		System.out.println("Rectified Nlg Villanges  --> "+nlgVillages);
		
	}
}
