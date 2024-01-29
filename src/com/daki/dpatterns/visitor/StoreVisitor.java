package com.stefancipe.dpatterns.visitor;

public class StoreVisitor implements Visitor{

	@Override
	public void visitGoldCC(GoldCreditCard cc) {
		System.out.println("The offer is 10% off");		
	}

	@Override
	public void visitSilverCC(SilverCreditCard cc) {
		System.out.println("The offer is 4% off");		
	}

}
