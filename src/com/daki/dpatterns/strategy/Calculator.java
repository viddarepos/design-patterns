package com.stefancipe.dpatterns.strategy;

public class Calculator {

	private Operation operation;
	
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	
	public void executeOperation(double a, double b) {
		System.out.println("The result of operation is: " + operation.execute(a, b));
	} 
	
	
}
