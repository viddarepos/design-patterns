package com.stefancipe.dpatterns.visitor;

public class GoldCreditCard implements ICreditCard {

	@Override
	public String getName() {
		return "Gold";
	}

	@Override
	public void accept(Visitor v) {
		v.visitGoldCC(this);
	}

}
