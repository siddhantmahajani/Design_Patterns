package com.design.pattern.builder;

public class VegBurger extends Burger {
	
	@Override
	public float price() {
		return 25.00f;
	}
	
	@Override
	public String name() {
		return "Veg Burger";
	}
}
