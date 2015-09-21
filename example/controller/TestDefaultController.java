package example.controller;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDefaultController {

	private DefaultController controller;
	private Request request;
	private RequestHandler handler;
	
	@Before
	public void initialize() {
		
		request = new SampleRequest();
		handler = new SampleRequestHandler();
		controller = new DefaultController();
		
		controller.addRequestHandler(request, handler);
		
	} // end instantiate method
	
	/* Verifica se ao adicionar um RequestHandler em um DefaultController
	 * e chamar o método getRequestHandler dessa mesma classe, o objeto
	 * criado e o recuperado são os mesmo */
	
	@Test
	public void testAddRequestHandler() {
		
		RequestHandler handlerReturned = controller.getRequestHandler(request);
		
		assertSame("request handler added to controller and " + 
				"request handler returned by controller are not the same",
				handler, handlerReturned);
		
	} // end testMethod class
	
	@Test
	public void testProcess() throws ResponseException {
		
		Response response = controller.process(request);
		
		assertNotNull("response is null", response);
		assertEquals("Response returned and the " + 
				"object added are not equals", 
				new SampleResponse(), response);
		
	} // end testProcess method
	
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
		
		public String getName() {
			
			return "Test";
			
		} // end getName method
		
		@Override
		public boolean equals(Object o) {
			
			boolean result = false;
			
			if (o instanceof SampleResponse) {
				
				SampleResponse response = (SampleResponse) o;
				
				return response.getName().equals(getName());
				
			}
			
			return result;
			
		} // end equals method
		
	} // end SampleResponse inner class
	
} // end TestDefaultController class