package com.design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(final Item item) {
		items.add(item);
	}
	
	public float cost() {
		float cost = 0.0f;
		
		for (final Item i : items) {
			cost += i.price();
		}
		return cost;
	}
	
	public void showItems() {
		items.forEach(i -> {
			System.out.println("Item: " + i.name());
			System.out.println("Packing: " + i.packing());
			System.out.println("Price: " + i.price());
		});
	}
}
