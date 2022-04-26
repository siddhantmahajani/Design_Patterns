package com.design.pattern.factory;

public abstract class Plan {
	
	protected double rate;
	abstract void getRate();
	
	public void calculateBill(final int units) {
		System.out.println("Total bill is: " + (units * rate) + " for " + units + " units.");
	}

}
