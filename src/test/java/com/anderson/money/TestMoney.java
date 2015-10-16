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
	
	@Test
	public void testPlusReturnsSum() {
		
		Money five = Money.dollar(5);
		
		Expression expression = five.plus(five);
		
		Sum sum = (Sum) expression;
		
		assertEquals(five, sum.augend);
		assertEquals(five, sum.addend);
		
	} // end testPlusReturnsSum method
	
	@Test
	public void testReduceSum() {
	
		Expression sum = new Sum(Money.dollar(4), Money.dollar(3));
		
		Bank bank = new Bank();
		
		Money result = bank.reduce(sum, "USD");
		
		assertEquals(Money.dollar(7), result);
		
	} // end testReduceSum method
	
	@Test
	public void testReduceMoney() {
		
		Bank bank = new Bank();
		
		Money result = bank.reduce(Money.dollar(1), "USD");
		
		assertEquals(Money.dollar(1), result);
		
	} // end testReduceMoney method
	
	@Test
	public void testReduceMoneyDifferentCurrency() {
		
		Bank bank = new Bank();
		
		bank.addRate("CHF", "USD", 2);
		
		Money result = bank.reduce(Money.franc(2), "USD");
		
		assertEquals(Money.dollar(1), result);
		
	} // end testReduceMoneyDifferentCurrency method
 	
	@Test
	public void testIdentityRate() {
		
		assertEquals(1, new Bank().rate("USD", "USD"));
		
	} // end testIdentityRate method
	
} // end TestMoney class