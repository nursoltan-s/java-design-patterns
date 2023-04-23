package com.nursoltan.javaDesignPatterns.adapter;

public class Program {

	public static void main(String[] args) {
		OldCoffeeMachine old = new OldCoffeeMachine();
		CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(old);
		
		adapter.chooseFirstSelection();
		adapter.chooseSecondSelection();
	}

}
