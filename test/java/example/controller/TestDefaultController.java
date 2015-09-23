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
	
	@Test(expected=ResponseException.class)
	public void testProcessAnswersResponseException() throws ResponseException {
		
		Request request = new SampleRequest("testError");
		RequestHandler handler = new SampleRequestHandlerException();
		
		controller.addRequestHandler(request, handler);
		
		controller.process(request);
	
	} // end testProcessAnswersResponseException method
	
	@Test(expected=NoSuitableRequestHandlerException.class)
	public void testGetHandlerNotRegistered() {
		
		controller.getRequestHandler(new SampleRequest("notRegisteredTest"));
		
	} // end testGetHandlerNotRegistered method
	
	@Test(timeout=200)
	public void testProcessMultipleRequestsTimeout() throws ResponseException {
		
		Request request;
		RequestHandler handler = new SampleRequestHandler();
		Response sampleResponse = new SampleResponse();
		
		for (int i = 1; i <= 10000; i++) {
			
			request = new SampleRequest(String.valueOf(i));
			controller.addRequestHandler(request, handler);
			Response response = controller.process(request);
			
			assertNotNull("response must be not null", response);
			assertEquals("Wrong response returned by process",
					sampleResponse, response);
			
		}
		
	} // end testProcessMultipleRequestsTimeout method
	
	@Test(expected=RuntimeException.class)
	public void testAddRequestHandlerAlreadyAdded() {
		
		Request request = new SampleRequest();
		RequestHandler handler = new SampleRequestHandler();
		
		controller.addRequestHandler(request, handler);
		
	} // end testAddRequestHandlerAlreadyAdded method
	
	private class SampleRequest implements Request {
		
		private static final String DEFAULT_NAME = "Test";
		private String name;
		
		public SampleRequest(String name) {
			
			this.name = name;
			
		} // end SampleRequest constructor -- String
		
		public SampleRequest() {
			
			this(DEFAULT_NAME);
			
		} // end SampleRequest constructor
		
		public String getName() {
			
			return name;
			
		} // end getName method
		
	} // end SampleRequest inner class
	
	private class SampleRequestHandler implements RequestHandler {
		
		public Response process(Request request) {
			
			return new SampleResponse();
			
		} // end process method
		
	} // end SampleRequestHandler inner class
	
	private class SampleRequestHandlerException implements RequestHandler {
		
		public Response process(Request request) throws Exception {
			
			throw new Exception("exception processing request");
			
		}
		
	}
	
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