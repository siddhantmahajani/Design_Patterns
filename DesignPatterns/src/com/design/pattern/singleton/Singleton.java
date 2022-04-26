package com.design.pattern.singleton;

public class Singleton {
	
	private static Singleton obj = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getSingletonObject() {
		return obj;
	}
	
	public void showMessage() {
		System.out.println("This is a singleton object.");
	}
}
