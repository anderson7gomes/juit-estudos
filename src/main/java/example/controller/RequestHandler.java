package example.controller;

public interface RequestHandler {

	Response process(Request request) throws Exception;
	
} // end RequestHandler interface