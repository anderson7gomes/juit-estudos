package example.controller;

@SuppressWarnings("serial")
public class ResponseException extends Exception {

	private Request request;
	private Exception originalException;
	
	public ResponseException(Request request, Exception originalException) {
		
		this.request = request;
		this.originalException = originalException;
		
	} // end ResponseException constructor -- Request, Exception
	
	public Request getRequest() {
		return request;
	} // end getRequest method
	
	public Exception getOriginalException() {
		return originalException;
	} // end getOriginalException method
	
} // end ReponseError class