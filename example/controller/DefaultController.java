package example.controller;

import java.util.LinkedHashMap;
import java.util.Map;

public class DefaultController implements Controller {

	private Map<String, RequestHandler> handlers = new LinkedHashMap<>(); 
	
	private RequestHandler getRequestHandler(Request request) {
		
		if (handlers.containsKey(request.getName())) {
			return handlers.get(request.getName());
		}
		
		throw new NoSuitableRequestHandlerException(request.getName());
		
	} // end getRequestHandler method
	
	public Response process(Request request) throws ResponseException {
		
		Response response;
		
		try {
			
			response = getRequestHandler(request).process(request);
			
		} catch (Exception e) {
			
			throw new ResponseException(request, e);
			
		}
		
		return response;
		
	} // end process method
	
	public void addRequestHandler(Request request, RequestHandler requestHandler) {
		
		if (handlers.containsKey(request.getName())) {
			
			throw new RuntimeException(
					String.format("This request (%s) already " + 
							"have a request handler specified", request.getName()));
			
		}
		
		handlers.put(request.getName(), requestHandler);
		
	} // end addRequestHandler method
 	
} // end DefaultController class