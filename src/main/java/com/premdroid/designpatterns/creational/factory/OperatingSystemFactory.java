package com.premdroid.designpatterns.creational.factory;

public class OperatingSystemFactory {
	public static OS getInstance(String name) {
		if (name.equals("Open")) {
			return new Android();
		} else if (name.equals("Closed")) {
			return new IOS();
		} else {
			return new Windows();
		}
	}
}
