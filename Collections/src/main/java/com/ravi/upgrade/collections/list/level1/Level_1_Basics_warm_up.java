package com.ravi.upgrade.collections.list.level1;

import java.util.ArrayList;
import java.util.List;

public class Level_1_Basics_warm_up {
	public static void main(String[] args) {
		System.out.println("Hello welcome to array list basics");
		
		// Different ways to create arrays
		List<String> countries=new ArrayList<>();
		ArrayList<String> states=new ArrayList<>();
		var districtis=new ArrayList<String>();
		
		// Append elements at the end of the collection
		districtis.add("NLG"); // [ NLG ]
		districtis.add("WG");  // [ NLG, WG ]
		districtis.add("KM");  // [ NLG, WG, KM ]
		
		System.out.println(" Districts -- 0 "+districtis); // [ NLG, WG, KM ]
		System.out.println();
		
		// add at index
		districtis.add(0, "HYD"); // [ HYD, NLG, WG, KM ]
		districtis.add(0, "YD");  // [ YD, HYD, NLG, WG, KM ]
		
		System.out.println(" Districts -- 1 "+districtis); // [ YD, HYD, NLG, WG, KM ]
		System.out.println();
		
		// get by index
		System.out.println("districtis.get(index) -- "+districtis.get(0)); // [YD]
		System.out.println("districtis.get(index) -- "+districtis.get(4)); // [KM]
		//System.out.println("districtis.get(index) -- "+districtis.get(5)); // IndexOutOfBoundException
		
		// new district list
		var newDistricts=new ArrayList<String>();
		newDistricts.add("VANAPARTHI");
		newDistricts.add("Bhuvanagiri");
		newDistricts.add("Devarakonda");
		
		// merge old and new districits
		//districtis.addAll(newDistricts);
		
		// print all districts
		//System.out.println(" All districts -- "+districtis); // [ YD, HYD, NLG, WG, KM , VANAPARTHI, Bhuvanagiri, Devarakonda]
		
		districtis.addAll(0, newDistricts);
		System.out.println(" All districts -- "+districtis); // [ VANAPARTHI, Bhuvanagiri, Devarakonda, YD, HYD, NLG, WG, KM]
		
		
		districtis.addFirst("ML"); //[ ML, VANAPARTHI, Bhuvanagiri, Devarakonda, YD, HYD, NLG, WG, KM]
		districtis.addLast("SC");	//[ ML, VANAPARTHI, Bhuvanagiri, Devarakonda, YD, HYD, NLG, WG, KM, SC]
		
		System.out.println(" All districts -- "+districtis);//[ ML, VANAPARTHI, Bhuvanagiri, Devarakonda, YD, HYD, NLG, WG, KM, SC]
		System.out.println();
		System.out.println(" All districts size -- "+districtis.size());
		System.out.println();

		// remove elements using index, using sequencical method and using element name
		districtis.remove(0);
		districtis.removeLast();
		districtis.remove("YD");
		
		
		System.out.println(" All districts -- "+districtis);//[ VANAPARTHI, Bhuvanagiri, Devarakonda, HYD, NLG, WG, KM]
		System.out.println();
		System.out.println(" All districts size -- "+districtis.size());
		System.out.println();
		
		// replace an element
		districtis.set(0, "VNPI");//[ VNPI, Bhuvanagiri, Devarakonda, HYD, NLG, WG, KM]
		
		System.out.println(" All districts -- "+districtis);//[ VNPI, Bhuvanagiri, Devarakonda, HYD, NLG, WG, KM]
				
		// remove all elements
		districtis.clear();
		System.out.println(" after clear All districts -- "+districtis);
		System.out.println(" All districts size -- "+districtis.size());
		
		
		
	}
}	
