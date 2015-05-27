package br.com.client;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class TesteProdutoResource {
	public static void main(String[] args) {
		Client client = new Client();

		WebResource resourceXML = client
				.resource("http://localhost:8080/produtos/1/xml");
		System.out.println("TESTANDO COM XML");
		String xml = resourceXML.get(String.class);
		System.out.println(xml);

		WebResource resourceJSON = client
				.resource("http://localhost:8080/produtos/1/json");

		System.out.println("TESTANDO COM JSON");
		String json = resourceJSON.get(String.class);
		System.out.println(json);

	}

}
