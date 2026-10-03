package com.ravi.upgrade.collections.list.level1;

import java.util.ArrayList;
import java.util.List;

public class Level_1_Basics_warm_up_practice_tasks {
	public static void main(String[] args) {
		
		//		Create a list of 5 cities, print each one with its index.
		var cities = new ArrayList<String>();
		cities.add("Hyderabad");
		cities.add("Warangal");
		cities.add("Nalgonda");
		cities.add("Devarakonda");
		cities.add("Hanumakonda");
		for(String city: cities) {
			System.out.println("City --> "+city+" --> its index is "+cities.indexOf(city));
		}
		System.out.println();
		//		Insert "Hyderabad" at position 2, then replace the last city with "Pune".
		cities.add(2, "Hyderabad");
		cities.set(cities.size()-1, "Pune");
		System.out.println("Updated cities --> "+cities);
		System.out.println();
		//		Check whether "Delhi" exists. If not, add it at the start.
		if(!cities.contains("Delhi"))
			cities.addFirst("Delhi");
		System.out.println(" 2nd updated cities --> "+cities);
		System.out.println();
		//		Find the indexOf and lastIndexOf of a value that appears twice.
		System.out.println("Index of Hyderabad -- "+cities.indexOf("Hyderabad"));
		System.out.println("Last Index of Hyderabad -- "+cities.lastIndexOf("Hyderabad"));
		
		
		
	}
}
