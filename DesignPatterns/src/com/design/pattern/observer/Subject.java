package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	final private List<Observer> observers = new ArrayList<>();
	private int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(final int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void notifyAllObservers() {
		observers.forEach(o -> {
			o.update();
		});
	}
	
	public void attach(final Observer observer) {
		observers.add(observer);
	}

}
