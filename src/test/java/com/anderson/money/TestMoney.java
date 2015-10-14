package com.anderson.money;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestMoney {

	@Test
	public void testEquals() {
		
		Money fiveDollars = Money.dollar(5);
		Money sixFrancs = Money.franc(6);
		
		assertEquals(Money.dollar(5), fiveDollars);
		
		assertEquals( Money.franc(6), sixFrancs);
		
		assertNotEquals(Money.dollar(6), fiveDollars);
		
		assertNotEquals(Money.franc(4), sixFrancs);
		
		assertNotEquals(Money.franc(5), fiveDollars);
		
	} // end testEquals method
	
	@Test
	public void testTimes() {
		
		Money dollar = Money.dollar(3);
		
		assertEquals(Money.dollar(15), dollar.times(5));
		assertEquals(Money.dollar(18), dollar.times(6));
		
	} // end testTimes method
	
	@Test
	public void testCurrency() {
		
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
		
	} // end testCurrency method
	
	@Test
	public void testSimpleAddition() {
		
		Money five = Money.dollar(5);
		
		Expression sum = five.plus(five);
		
		Bank bank = new Bank();
		
		Money reduced = bank.reduce(sum, "USD");
		
		assertEquals(Money.dollar(10), reduced);
		
	} // end testSimpleAddition method
	
} // end TestMoney class