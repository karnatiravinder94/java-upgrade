package com.ravi.upgrade;

/**
 * Hello world!
 */
public class RunnablesTest {
    public static void main(String[] args) {
        /*
         * Lagacy way of runnable implemenation
         */
    	Runnable legacyRunnable1=new Runnable() {
    		@Override
    		public void run() {
    			System.out.println("Legacy run 1");
    		}
    	};
    	new Thread(legacyRunnable1).start();
    	
    	new Thread(new Runnable() {
    		@Override
    		public void run() {
    			System.out.println("Legary runnable run1");
    		}
    	}).start();
    	System.out.println();
    	
    	/*
    	 * Modren way of runnable implementation
    	 */
    	Runnable modrenRunnable1= ()->{
    		System.out.println("Modren runnable run1");
    	};
    	new Thread(modrenRunnable1).start();
    	
    	Runnable modrenRunnable2=()-> System.out.println("Modren runnable run2");
    	new Thread(modrenRunnable2).start();
    	
    	new Thread(()-> System.out.println("Modren runnable run3"));
    	
    	
    	
    }
}
