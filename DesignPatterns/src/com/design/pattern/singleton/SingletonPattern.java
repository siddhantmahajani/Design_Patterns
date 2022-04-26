package com.design.pattern.singleton;

public class SingletonPattern {
	public static void main(String[] args) {
		final Singleton obj = Singleton.getSingletonObject();
		obj.showMessage();
	}
}
