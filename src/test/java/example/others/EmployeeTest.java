package example.others;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {

	@Test
	public void testGetName() {
		
		Employee employee = new Employee("Anderson");
	
		assertEquals("Name not equals", "Anderson", 
				employee.getName());
		
	} // end testGetName method
	
} // end EmployeeTest class