package module8.exceptionyoll1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class URLConnection {

	public static void main(String[] args) {
		
		HttpsURLConnection connection = null;
		
		try {

		URL urlGoogle = new URL("https://www.google.com/images");
		connection = (HttpsURLConnection)urlGoogle.openConnection();
		
		System.out.println(connection.getURL());
		System.out.println(connection.getRequestMethod());
		System.out.println(connection.getResponseCode());
				
		}catch(MalformedURLException e) {
			
			System.out.println("The URL is not connected!");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			connection.disconnect();
		}
		
	}

}
