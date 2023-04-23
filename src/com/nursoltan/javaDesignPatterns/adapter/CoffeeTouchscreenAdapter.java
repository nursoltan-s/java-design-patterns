package com.nursoltan.javaDesignPatterns.adapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	
	private OldCoffeeMachine oldVendingMachine;

	public CoffeeTouchscreenAdapter(OldCoffeeMachine oldVendingMachine) {
		super();
		this.oldVendingMachine = oldVendingMachine;
	}

	@Override
	public void chooseFirstSelection() {
		oldVendingMachine.selectA();
	}

	@Override
	public void chooseSecondSelection() {
		oldVendingMachine.selectB();
	}
}
