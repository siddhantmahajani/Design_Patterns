package com.design.pattern.strategy;

public class StrategyPattern {
	public static void main(String[] args) {
		final Context context = new Context(new Add());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
	}
}
