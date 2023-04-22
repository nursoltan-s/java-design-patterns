/**
 * 
 */
package com.nursoltan.javaDesignPatterns.singleton;

/**
 * @author ns
 *
 */
public class SingletonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ExampleSingleton.getInstance());
		ExampleSingleton.getHello();
	}

}
