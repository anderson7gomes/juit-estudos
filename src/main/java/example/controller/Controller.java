package example.controller;

public interface Controller {

	Response process(Request request) throws ResponseException;
	
	void addRequestHandler(Request request, 
			RequestHandler handler); 
	
} // end Controller interface