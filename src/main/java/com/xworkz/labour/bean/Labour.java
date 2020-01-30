package com.xworkz.labour.bean;

public class Labour {

	private String name;
	private int experiance;
	private ThreadImpl threadImpl;
	
	public Labour(String name) {
		this.name = name;
		System.out.println("Created \t"+name);
	}
	
	public void setExperiance(int experiance) {
		this.experiance = experiance;
		System.out.println("Created \t"+experiance);
	}
	
	public void setThreadImpl(ThreadImpl threadImpl) {
		this.threadImpl = threadImpl;
		System.out.println("Created \t"+threadImpl);
	}
	
	public void work() {
		this.threadImpl.start();
		this.threadImpl.run();
	}
}
