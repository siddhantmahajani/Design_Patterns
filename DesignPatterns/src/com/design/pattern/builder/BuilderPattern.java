package com.design.pattern.builder;

public class BuilderPattern {
	public static void main(String[] args) {
		final MealBuilder mealBuilder = new MealBuilder();
		
		final Meal veg = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		veg.showItems();
		System.out.println("Total Cost: " + veg.cost());
		
		final Meal nonVeg = mealBuilder.prepareNonVegMeal();
		System.out.println("Non Veg Meal");
		nonVeg.showItems();
		System.out.println("Total Cost: " + nonVeg.cost());
	}
}
