package com.design.pattern.builder;

public class Coke extends ColdDrink {
	
	@Override
	public float price() {
		return 3.50f;
	}
	
	@Override
	public String name() {
		return "Coke";
	}
}
