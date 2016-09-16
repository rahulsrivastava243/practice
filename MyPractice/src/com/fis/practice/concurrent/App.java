package com.fis.practice.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		for(int i = 0 ;i <5 ;i++)
		executorService.submit(new Processor(i));
		executorService.shutdown();
	}
}
