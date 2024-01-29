package com.stefancipe.dpatterns.visitor;

public class SilverCreditCard implements ICreditCard {

	@Override
	public String getName() {
		return "Silver";
	}

	@Override
	public void accept(Visitor v) {
		v.visitSilverCC(this);
	}

}
