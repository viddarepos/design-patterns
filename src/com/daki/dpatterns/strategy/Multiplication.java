package com.stefancipe.dpatterns.strategy;

public class Multiplication implements Operation {

	@Override
	public double execute(double a, double b) {
		return a*b;
	}

}
