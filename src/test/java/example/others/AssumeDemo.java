package example.others;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assume.assumeNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class AssumeDemo {
	
	@Parameters(name = "{index}: {0} {1}")
	public static Collection<String[]> getParameters() {
		
		String[] tupla1 = {"AND", "and"};
		String[] tupla2 = {"AND", "And"};
		String[] tupla3 = {null, "AnD"};
		
		return Arrays.asList(tupla1, tupla2, tupla3);
		
	} // end getParameters method
	
	public AssumeDemo(String expected, String value) {
		
		this.expected = expected;
		this.value = value;
		
	} // end AssumeDemo constructor -- String, String
	
	private String expected;
	private String value;
	
	@Test
	public void testAssume() {
		
		assumeNotNull(expected);
		
		assertEquals(expected, value.toUpperCase());
		
	} // end testAssume
	
} // end AssumeDemo class