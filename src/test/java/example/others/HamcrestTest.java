package example.others;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class HamcrestTest {

	private List<String> numbers;
	
	public HamcrestTest() {
		
		numbers = Arrays.asList("one", "two", "three");
		
	} // end HamcrestTest constructor
	
	@Test
	@Ignore("Teste não passa de propósito")
	public void testWithoutHamcrest() {
		
		assertTrue(numbers.contains("red")
				|| numbers.contains("green")
				|| numbers.contains("blue"));
		
	} // end testWithoutHamcrest method
	
	@Test
	public void testWithHamcrest() {
		
		assertThat(numbers, hasItem(anyOf(equalTo("one"), 
				equalTo("two"), equalTo("three"))));
		
	} // end testWithHamcrest method
	
} // end HamcrestTest class