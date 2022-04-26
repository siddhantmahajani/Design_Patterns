package com.design.pattern.state;

public class StopState implements State {
	
	@Override
	public void doAction(final Context context) {
		System.out.println("In stop state");
		context.setState(this);
	}
	
	public String toString() {
		return "Stop state";
	}
}
