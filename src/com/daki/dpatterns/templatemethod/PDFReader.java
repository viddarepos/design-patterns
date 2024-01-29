package com.stefancipe.dpatterns.templatemethod;

public class PDFReader extends Reader {

	@Override
	public void parseFile() {
		System.out.println("reading .pdf file...");
	}

}
