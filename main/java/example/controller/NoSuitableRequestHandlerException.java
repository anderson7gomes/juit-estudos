package example.controller;

@SuppressWarnings("serial")
public class NoSuitableRequestHandlerException extends RuntimeException {
	
	public NoSuitableRequestHandlerException(String requestName) {
		super(requestName);
	} // end NoSuitableRequestHandlerException constructor -- String

} // end NoSuitableRequestHandlerException class