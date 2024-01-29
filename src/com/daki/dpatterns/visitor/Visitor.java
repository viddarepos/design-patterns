package com.stefancipe.dpatterns.visitor;

public interface Visitor {
	void visitGoldCC(GoldCreditCard cc);
	void visitSilverCC(SilverCreditCard cc);
}
