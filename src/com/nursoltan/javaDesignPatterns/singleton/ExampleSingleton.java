package com.nursoltan.javaDesignPatterns.singleton;

public class ExampleSingleton {
	private static ExampleSingleton uniqueInstance = null;
	
	private ExampleSingleton() {
		// private constructor
	}
	
	public static ExampleSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ExampleSingleton();
		}
		
		return uniqueInstance;
	}
	
	public static void getHello() {
		System.out.println("Hello from Singleton Class");
	}
}
