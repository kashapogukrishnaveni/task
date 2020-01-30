package com.xworkz.labour.bean;

public class ThreadImpl extends Thread {

	@Override
	public void start() {
		System.out.println("invoked start");
	}
	
	@Override
	public void run() {
		System.out.println("running");
	}
}
