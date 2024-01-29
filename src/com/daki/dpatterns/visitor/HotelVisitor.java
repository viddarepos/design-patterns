package com.stefancipe.dpatterns.visitor;

public class HotelVisitor implements Visitor{

	@Override
	public void visitGoldCC(GoldCreditCard cc) {
		System.out.println("The offer is 5% off");		
	}

	@Override
	public void visitSilverCC(SilverCreditCard cc) {
		System.out.println("The offer is 3.2% off");		
	}

}
