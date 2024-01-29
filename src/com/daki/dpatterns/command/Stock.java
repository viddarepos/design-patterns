package com.stefancipe.dpatterns.command;

public class Stock {
	private String name;
	private int quantity;
	
	public Stock(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public void buy() {
		System.out.println("Stock " + this.name + " (quantity = " + quantity + ") bought");
	}
	
	public void sell() {
		System.out.println("Stock " + this.name + " (quantity = " + quantity + ") sold");
	}
}
