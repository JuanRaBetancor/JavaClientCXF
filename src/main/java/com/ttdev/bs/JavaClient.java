package com.ttdev.bs;

//import javax.ws.rs.client.Client;
//import javax.ws.rs.client.ClientBuilder;
//import javax.ws.rs.core.Response;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.ClientResponse;
//import org.apache.cxf.jaxrs.client.WebClient;

//import java.net.MalformedURLException;
//import java.net.URL;

//import javax.xml.namespace.QName;
//import javax.xml.ws.Service;

public class JavaClient {
	public static void main(String[] args) {
		//WebClient client = WebClient.create("http://pccompshop.com/home/?q=es/endpoint");
		//client.path("node/47");
		//Result xresult = client.get(Result.class);
		//System.out.println(xresult.getTitle());
		
		Client client = Client.create();
		WebResource webResource = client.resource("http://pccompshop.com/home/?q=es/endpoint/node/47");
		ClientResponse response = webResource.accept("application/xml").get(ClientResponse.class);
		Result result = response.getEntity(Result.class);
		System.out.println(result.getTitle());
		System.out.println(result.getVid());
		
		
		
	}
}
