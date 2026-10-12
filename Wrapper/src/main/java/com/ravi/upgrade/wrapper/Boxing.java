package com.ravi.upgrade.wrapper;

/**
 * Hello world!
 *
 */
public class Boxing 
{
    public static void main( String[] args )
    {
        
    	//int to Integer wrapper class
    	int i=10;
    	Integer age1=Integer.valueOf(i);
    	Integer age2=Integer.valueOf(i);
//    	System.out.println(age1 ==  age2);
//    	System.out.println(age1.equals(age2));
        System.out.println(age1);
    	
    	int j= age1.intValue();
    	System.out.println(j);
    }
}
