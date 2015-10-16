package com.anderson.money;

import java.util.HashMap;

public class Bank {

	private HashMap<Pair, Integer> rates = new HashMap<>();
	
	public Money reduce(Expression source, String to) {
		
		return source.reduce(this, to);
		
	} // end reduce method
	
	public int rate(String from, String to) {
		
		if (from.equals(to)) {
			return 1;
		}
		
		return rates.get(new Pair(from, to));
		
	} // end rate method
	
	public void addRate(String from, String to, int rate) {
		
		rates.put(new Pair(from, to), rate);
		
	} // end addRate method
	
	private class Pair {
		
		private String from;
		private String to;
		
		Pair(String from, String to) {
			
			this.from = from;
			this.to = to;
			
		} // end Pair constructor -- String, String
		
		@Override
		public boolean equals(Object object) {
			
			Pair pair = (Pair) object;
			
			return from.equals(pair.from) && 
					to.equals(pair.to);
			
		} // end equals method
		
		@Override
		public int hashCode() {
			
			return 0;
			
		} // end hashCode method
		
	} // end Pair class
	
} // end Bank class