package com.stefancipe.dpatterns.visitor;

public interface ICreditCard {
	String getName();
	void accept(Visitor v);
}
