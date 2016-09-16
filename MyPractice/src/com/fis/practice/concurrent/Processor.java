package com.fis.practice.concurrent;
public class Processor implements Runnable{
	int id= 0;
	public  Processor(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("starting:" + id);
		try {Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		System.out.println("complete:" + id);
	}

	
}
