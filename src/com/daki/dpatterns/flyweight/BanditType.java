package com.stefancipe.dpatterns.flyweight;

public class BanditType {

	private String name;
	private double health, stamina, magicka;
	
	public BanditType(String name, double health, double stamina, double magicka) {
		System.out.println("BanditType " + name + " constructed");
		this.name = name;
		this.health = health;
		this.stamina = stamina;
		this.magicka = magicka;
	}

	@Override
	public String toString() {
		return "BanditType [name=" + name + ", health=" + health + ", stamina=" + stamina + ", magicka=" + magicka
				+ "]";
	}
	
}