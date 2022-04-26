package com.design.pattern.state;

public class StatePattern {
	public static void main(String[] args) {
		final Context context = new Context();
		
		final StartState start = new StartState();
		start.doAction(context);
		System.out.println(context.getState().toString());
		
		final StopState stop = new StopState();
		stop.doAction(context);
		System.out.println(context.getState().toString());
	}
}
