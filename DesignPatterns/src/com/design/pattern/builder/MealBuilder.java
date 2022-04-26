package com.design.pattern.builder;

public class MealBuilder {
	
	public Meal prepareVegMeal() {
		final Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		final Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Coke());
		return meal;
	}
}
