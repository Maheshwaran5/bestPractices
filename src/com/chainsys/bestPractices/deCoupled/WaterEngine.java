package com.chainsys.bestPractices.deCoupled;

public class WaterEngine implements Iengine {

	@Override
	public void start() {
		System.out.println("water engine started");
	}

	@Override
	public void stop() {
		System.out.println("water engine stopped");
	}
          
}