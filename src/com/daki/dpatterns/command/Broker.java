package com.stefancipe.dpatterns.command;

import java.util.LinkedList;
import java.util.Queue;

public class Broker {
	private Queue<Order> orders;
	
	public Broker() {
		orders = new LinkedList<>();
	}
	
	public void addOrder(Order order) {
		this.orders.add(order);
	}
	
	public void executeNextOrder() {
		orders.poll().execute();
	}
	
	public void executeAll() {
		while(!orders.isEmpty()) {
			executeNextOrder();
		}
	}
	
}
