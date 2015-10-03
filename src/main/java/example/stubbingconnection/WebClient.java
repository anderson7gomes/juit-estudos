package example.stubbingconnection;

import java.io.InputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebClient {

	public void getContent(URL url) {
		
		StringBuffer content = new StringBuffer(100);
		
		try {
			
			HttpURLConnection connection = (HttpURLConnection) 
					url.openConnection();
			
			connection.setDoInput(true);
			
			InputStream is = connection.getInputStream();
			
			byte[] buffer = new byte[2048];
			int count;
			
			while ((count = is.read(buffer)) != -1) {
				content.append(new String(buffer, 0, count));
			}
			
		} catch (IOException e) {
			System.err.println("Error while open connection");
		}
		
	} // end getContent method
	
} // end WebClient class