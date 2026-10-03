package com.ravi.upgrade.lambda.comparator;

import java.util.Comparator;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*
         * Prior to java 8
         */
    	Comparator<Integer> legacyComparator=new Comparator<Integer>() {
    		@Override
    		public int compare(Integer o1, Integer o2) {
    			// TODO Auto-generated method stub
    			return o1.compareTo(o2);
    		}
    	};
    	System.out.println("Legacy comparator --> "+legacyComparator.compare(3, 2));
    	
    	/*
    	 * WIth java 8
    	 */
    	Comparator<Integer> lambdaComparator=(Integer a,Integer b)->{
    		return a.compareTo(b);
    	};
    	System.out.println("Java 8 comparator imp1 ---> "+lambdaComparator.compare(3,2));
    	Comparator<Integer> lambdaComparator2=(a,b)->  a.compareTo(b);
    	System.out.println("Java 8 lambadComparator2 --> "+lambdaComparator2.compare(3, 2));
    	
    	
    	
    	
    }
}
