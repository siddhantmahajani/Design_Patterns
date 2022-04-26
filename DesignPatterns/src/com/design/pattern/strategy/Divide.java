package com.design.pattern.strategy;

public class Divide implements Strategy {
	
	@Override
	public int doOperation(final int a, final int b) {
		return a / b;
	}
}
