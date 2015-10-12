package com.anderson.money;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class TestFranc {

	@Test
	public void testTimes() {
		
		Franc five = Money.franc(5);
		
		Franc product = (Franc) Money.franc(5).times(2);
		
		Franc product2 = (Franc) Money.franc(5).times(3);
		
		assertTrue("Objeto five foi alterado", 
				Money.franc(5).equals(five));
		
		assertEquals("amount de product deve ser igual ao " + 
				"amount de five vezes 2", Money.franc(10), product);
		
		assertEquals("amount de product2 dever ser igual ao " +
				"amount de five vezes 3", Money.franc(15), product2);
		
	} // end testTimes method
	
	@Test
	public void testEquals() {
		
		Franc five = Money.franc(5);
		
		assertEquals("Para dois objetos Franc serem iguais, " + 
				"ambos têm que ter o mesmo valor amount",
				Money.franc(5), five);
		
		assertNotEquals("Para dois objetos Franc serem diferentes, " + 
				"ambos não podem ter o mesmo valor amount",
				Money.franc(6), five);
		
	} // end testEquals method
	
} // end TestFranc class