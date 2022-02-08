package com.musucovery.study.ch08;

public class AutoCloseanleObj implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("close...");
		
	}

}
