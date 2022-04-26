package com.design.pattern.builder;

public class ChickenBurger extends Burger {
	
	@Override
	public float price() {
		return 30.00f;
	}
	
	@Override
	public String name() {
		return "Chicken Burger";
	}
}
