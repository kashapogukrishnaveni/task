package com.xworkz.rocket.bean;

public class Rocket {

	private Fuel fu;
	private Satellite sat;
	private String countryName;
	
	public Rocket() {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}
	
	public Rocket(Fuel fu) {
		this.fu = fu;
		System.out.println("Created \t "+fu);
	}
	
	public void setSat(Satellite sat) {
		this.sat = sat;
		System.out.println("Created \t "+sat);
	}
	
	public void setcountryName(String countryName) {
		this.countryName = countryName;
		System.out.println("Created \t "+countryName);
	}
	
	public void start() {
		this.fu.fire();
	}
	
	public void launch() {
		this.sat.launch(23);
	}

	@Override
	public String toString() {
		return "Rocket [fu=" + fu + ", sat=" + sat + ", countryName=" + countryName + "]";
	}	
}

