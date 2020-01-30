package com.xworkz.rocket.bean;

public class Fuel {

	private int liters;
	
	public Fuel(int liters) {
		this.liters = liters;
		System.out.println("Created \t "+liters);
	}
	
	public void fire() {
		System.out.println("invoked  fire");
	}

	@Override
	public String toString() {
		return "Fuel [liters=" + liters + "]";
	}
	
}

