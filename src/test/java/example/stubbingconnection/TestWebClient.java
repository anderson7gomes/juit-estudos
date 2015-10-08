package example.stubbingconnection;

import java.io.OutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.handler.AbstractHandler;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.util.ByteArrayISO8859Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;

public class TestWebClient {

	@BeforeClass
	public static void setUp() throws Exception {
		
		Server server = new Server(8080);
		
		TestWebClient t = new TestWebClient();
		
		Context contentOkContext = new Context(server, 
				"/testGetContentOk");
		
		contentOkContext.addHandler(t.new GetContentOkHandler());
		
		server.setStopAtShutdown(true);
		server.start();
		
	} // end setUp method
	
	@Test
	public void testGetContent() throws MalformedURLException {
		
		WebClient client = new WebClient();
		
		String result = client.getContent(new URL(
				"http://localhost:8080/testGetContentOk"));
		
		assertEquals("It works!", result);
		
	} // end testGetContent method
	
	@AfterClass
	public static void tearDown() {
		// EMPTY
	} // end tearDown method
	
	private class GetContentOkHandler extends AbstractHandler {
		
		@Override
		public void handle(String target, HttpServletRequest request,
				HttpServletResponse response, int dispatch) throws IOException {
			
			OutputStream out = response.getOutputStream();
			
			ByteArrayISO8859Writer writer = new ByteArrayISO8859Writer();
			
			writer.write("It works!");
			writer.flush();
			
			response.setIntHeader(HttpHeaders.CONTENT_LENGTH, writer.size());
			
			writer.writeTo(out);
			out.flush();
			
			writer.close();
			
		} // end handle method
		 
	} // end GetContentOkHandler inner class
	
} // end TestWebClient class