package com.ravi.upgrade.wrapper;

/*
 * Java compiler during compile time it detect the conversion
 * Converts values to respective Wrapper class object using XXXX.valudOf()
 * and ref.xxxValue(), so we need not to perform boxing and unboxing everytime
 * compiler take care of this, mostly this is helpfull when we are working with collections
 */
public class Unboxing {
	public static void main(String[] args) {
		int i=25;
		Integer age1=i;
		int j=age1;
		
		System.out.println("i -> "+i);
		System.out.println("age1 -> "+age1);
		System.out.println("j -> "+j);
	}
}
