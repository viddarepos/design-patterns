package com.stefancipe.dpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
	private List<Subscriber> subscribers;
	
	public Publisher() {
		subscribers = new ArrayList<>();
	}
	
	public void addSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}
	
	public void removeSubscriber(int index) {
		subscribers.remove(index);
	}
	
	public void notifyAll(String message) {
		for (Subscriber subscriber : subscribers) {
			subscriber.update(message);
		}
	}
}
