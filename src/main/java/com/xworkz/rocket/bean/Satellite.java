package com.xworkz.rocket.bean;

public class Satellite {

	private int launched;
	private String location;
	
	public Satellite() {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}
	
	public void setLaunched(int launched) {
		this.launched = launched;
		System.out.println("Created \t"+launched);
	}
	
	public void setLocation(String location) {
		this.location = location;
		System.out.println("Created \t"+location);
	}
	
	public void launch(int time) {
		System.out.println("invoked \t "+time);
	}

	@Override
	public String toString() {
		return "Satellite [launched=" + launched + ", location=" + location + "]";
	}
}

