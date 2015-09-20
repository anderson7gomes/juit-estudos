package example.controller;

import static org.junit.Assert.assertSame;
import org.junit.Before;
import org.junit.Test;

public class TestDefaultController {

	private DefaultController controller;
	
	@Before
	public void instantiate() {
		
		controller = new DefaultController();
		
	} // end instantiate method
	
	/* Verifica se ao adicionar um RequestHandler em um DefaultController
	 * e chamar o método getRequestHandler dessa mesma classe, o objeto
	 * criado e o recuperado são os mesmo */
	
	@Test
	public void testAddRequestHandler() {
		
		SampleRequest request = new SampleRequest();
		SampleRequestHandler handler = new SampleRequestHandler();
		
		controller.addRequestHandler(request, handler);
		RequestHandler handlerReturned = controller.getRequestHandler(request);
		
		assertSame("request handler added to controller and " + 
				"request handler returned by controller are not the same",
				handler, handlerReturned);
		
	} // end testMethod class
	
	private class SampleRequest implements Request {
		
		public String getName() {
			
			return "Test";
			
		} // end getName method
		
	} // end SampleRequest inner class
	
	private class SampleRequestHandler implements RequestHandler {
		
		public Response process(Request request) {
			
			return new SampleResponse();
			
		} // end process method
		
	} // end SampleRequestHandler inner class
	
	private class SampleResponse implements Response {
		
	} // end SampleResponse inner class
	
} // end TestDefaultController class