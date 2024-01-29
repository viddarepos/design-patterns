package com.stefancipe.dpatterns.templatemethod;

public class DOCReader extends Reader {

	@Override
	public void parseFile() {
		System.out.println("reading .doc file...");
	}
	
}
