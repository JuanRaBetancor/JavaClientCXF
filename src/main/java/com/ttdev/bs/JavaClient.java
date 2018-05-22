package com.ttdev.bs;

//import javax.ws.rs.client.Client;
//import javax.ws.rs.client.ClientBuilder;
//import javax.ws.rs.core.Response;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

//import antlr.Token;

import com.sun.jersey.api.client.ClientResponse;
//import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

//import java.net.MalformedURLException;
//import java.net.URL;
import org.apache.cxf.jaxrs.ext.form.Form;
//import javax.xml.namespace.QName;
//import javax.xml.ws.Service;
//import org.apache.cxf.rs.security.oauth.data.Token;
import org.apache.commons.lang.StringUtils;
public class JavaClient {
	public static void main(String[] args) {
		
		Client client2 = Client.create();
		
		WebResource webResource = client2.resource("http://pccompshop.com/home/?q=es/endpoint/comment/4");
		ClientResponse response = webResource.accept("application/xml").get(ClientResponse.class);
		Result result = response.getEntity(Result.class);
		System.out.println(result.getSubject());
		
		
		WebResource webResource2P = client2.resource("http://pccompshop.com/home/?q=es/endpoint/user/token");
		ClientResponse response2P = webResource2P.type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).post(ClientResponse.class, null);
		String outputP = response2P.getEntity(String.class);
		String token = StringUtils.substringBetween(outputP, "<token>", "</token>");
		System.out.println("Token: "+token);
		
		
		//WebResource webResource2 = client2.resource("http://pccompshop.com/home/?q=es/endpoint/user/token");
		//ClientResponse response2 = webResource2.type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).post(ClientResponse.class, null);
		//String output = response2.getEntity(String.class);
		//System.out.println(output);
		//String token = StringUtils.substringBetween(output, "<token>", "</token>");
		//System.out.println(token);
		
		//Form form = new Form();
		//form.set("username", "test");
		//form.set("password", "test");
		MultivaluedMap params = new MultivaluedMapImpl();
		params.add("username", "test");
		params.add("password", "test");
		WebResource webLogin = client2.resource("http://pccompshop.com/home/?q=es/endpoint/user/login");
		ClientResponse responseLogin = webLogin.header(token, "X-CSRF-Token").type(MediaType.APPLICATION_FORM_URLENCODED).post(ClientResponse.class, params);
		String output = responseLogin.getEntity(String.class);
		System.out.println(output);
		
		String newToken = StringUtils.substringBetween(output, "<token>", "</token>");
		System.out.println("New Token: "+newToken);
		String SessionId = StringUtils.substringBetween(output, "<sessid>", "</sessid>");
		System.out.println("Session ID: "+SessionId);
		String SessionName = StringUtils.substringBetween(output, "<session_name>", "</session_name>");
		System.out.println("Session name: "+SessionName);
		
		result.setSubject("COMENTARIO NUEVO");
		System.out.println("Nuevo título: "+result.getSubject());
		Result.CommentBody comment = result.getCommentBody();
		System.out.println("Comentario: "+comment);
		
		
		
		
		
		//WebResource webNode = client2.resource("http://pccompshop.com/home/?q=es/endpoint/user/login");
		//ClientResponse responseMod = webNode.header("Cookie",SessionName+"="+SessionId).accept("application/xml").post(ClientResponse.class, params);
		//ClientResponse responseMod = webNode.header(newToken, "X-CSRF-Token").header("cookie",SessionName+"="+SessionId).accept("application/xml").put(ClientResponse.class, result);
		//String resultado = responseMod.getEntity(String.class);
		//System.out.println(resultado);
		
		//String newToken = StringUtils.substringBetween(resultado, "<token>", "</token>");
		//System.out.println("New Token: "+newToken);
		
		//String output = response2.getEntity(String.class);
		//client2.header("X-CSRF-Token", token.getToken());
		//System.out.println(output);
		
		
		WebResource change = client2.resource("http://pccompshop.com/home/?q=es/endpoint/comment/4");
		ClientResponse respuesta = change.header(newToken, "X-CSRF-Token").header("cookie",SessionName+"="+SessionId).put(ClientResponse.class, result);
		String prf = respuesta.getEntity(String.class);
		System.out.println(prf);
		
		
		
	}
}
