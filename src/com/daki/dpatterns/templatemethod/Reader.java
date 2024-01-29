package com.stefancipe.dpatterns.templatemethod;

public abstract class Reader {

	public abstract void parseFile();
	
	public void readFile(String path) {
		System.out.println("Reading file at path " + path);
		parseFile();
		System.out.println("Closing file");
	}
	
}
