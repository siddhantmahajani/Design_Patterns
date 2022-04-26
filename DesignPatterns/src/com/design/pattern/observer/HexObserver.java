package com.design.pattern.observer;

public class HexObserver extends Observer {
	
	public HexObserver(final Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Hexa string: " + Integer.toHexString(subject.getState()));
	}
}
