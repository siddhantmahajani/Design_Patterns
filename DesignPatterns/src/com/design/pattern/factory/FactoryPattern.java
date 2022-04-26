package com.design.pattern.factory;

public class FactoryPattern {
	public static void main(String[] args) {
		final Plan p = GetPlan.getPlan("domestic");
		final int units = 1000;
		p.calculateBill(units);
	}
}
