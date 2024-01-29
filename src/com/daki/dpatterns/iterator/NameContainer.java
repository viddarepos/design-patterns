package com.stefancipe.dpatterns.iterator;

public class NameContainer implements Container {

	private String [] names =  {"Aca", "Boban", "Cveta", "Darko", "Emilija", "Filip", "Gordana", "Hristina", "Ivan", "Jelena", "Katarina"};
	
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {

		int index;
		
		public NameIterator() {
			index = 0;
		}
		
		@Override
		public boolean hasNext() {
			return index < names.length;
		}

		@Override
		public Object next() {
			if(hasNext()) return names[index++];
			return null;
		}
		
	}

}
