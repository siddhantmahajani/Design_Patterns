package com.design.pattern.state;

public class StartState implements State {
	
	@Override
	public void doAction(final Context context) {
		System.out.println("In start state");
		context.setState(this);
	}
	
	public String toString() {
		return "Start state";
	}
}
