package com.stefancipe.dpatterns.state;

public class ConcreteStateB implements State {

	@Override
	public void handle() {
		System.out.println("From concrete state B");
	}

}
