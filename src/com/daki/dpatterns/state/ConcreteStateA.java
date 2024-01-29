package com.stefancipe.dpatterns.state;

public class ConcreteStateA implements State {

	@Override
	public void handle() {
		System.out.println("From concrete state A");
	}

}
