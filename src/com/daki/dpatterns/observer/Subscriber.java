package com.stefancipe.dpatterns.observer;

import java.util.LinkedList;
import java.util.Queue;

public class Subscriber {
	
	Queue<String> messages;
	
	public Subscriber() {
		messages = new LinkedList<>();
	}
	
	public void update(String message) {
		this.messages.add(message);
	}
	
	public void readAll() {
		while(!messages.isEmpty()) {
			System.out.println("message: " + messages.poll());
		}
	}
	
}
