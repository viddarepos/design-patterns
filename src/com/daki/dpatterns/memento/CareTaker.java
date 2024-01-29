package com.stefancipe.dpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> mementos;

	public CareTaker() {
		mementos = new ArrayList<>();
	}

	public Memento getMemento(int index) {
		return mementos.get(index);
	}

	public void addMemento(Memento memento) {
		mementos.add(memento);
	}

	public Memento getLatestMemento() {
		return mementos.get(mementos.size() - 1);
	}
}
