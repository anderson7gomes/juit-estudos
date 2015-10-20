package example.others;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayEqualsDemo {
	
	@Test
	public void testArrayEquals() {
		
		String[] array1 = {"Anderson", "Gomes", 
				"Andrade"};
		
		String[] array2 = {"Anderson", "Gomes",
				"Andrade"};
		
		assertArrayEquals(array1, array2);
		
	} // end testArrayEquals method
	
	@Test
	public void testFail() {
		
		fail();
		
	} // end testFail method
	
} // end ArrayEqualsDemo class