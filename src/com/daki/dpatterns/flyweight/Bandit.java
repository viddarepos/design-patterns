package com.stefancipe.dpatterns.flyweight;

public class Bandit {
	private double x,y;
	private BanditType banditType;
	
	public Bandit(BanditType type, double x, double y) {
		this.banditType = type;
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Bandit [x coord=" + x + ", y coord=" + y + ", type=" + banditType + "]";
	}
	
	
	
}
