package almata.daw.main;

import java.io.IOException;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

import almata.daw.models.Lllistaproductes;
import almata.daw.models.Producte;


public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		 ClientConfig clientConfig = new DefaultClientConfig();
	        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
	        Client client = Client.create(clientConfig);

	        // GET request to findBook resource with a query parameter
	        String getToken = "http://localhost:8080/ServeiREST/api/serveiCarro/Autenticar";
	        String webResourceGet = client.resource(getToken).queryParam("nom", "admin").queryParam("passwd", "admin").accept(MediaType.APPLICATION_JSON).get(String.class);
	        
	       /* String getproductes = "http://localhost:8080/ServeiREST/api/serveiCarro/obtenirProductes";
	        List<Producte> productes = client.resource(getproductes).queryParam("idUser", webResourceGet).accept(MediaType.APPLICATION_JSON).get(new GenericType<List<Producte>>(){});
	        */
	        
	        String getproducte = "http://localhost:8080/ServeiREST/api/serveiCarro/obtenirProducte";
	        Producte producte = client.resource(getproducte).queryParam("idUser", webResourceGet).queryParam("idProduct", "1").accept(MediaType.APPLICATION_JSON).get(Producte.class);
	       /* ClientResponse response = webResourceGet.get(ClientResponse.class);
	        String responseEntity = response.getEntity(String.class);

	        if (response.getStatus() != 200) {
	            throw new WebApplicationException();
	        }

	        System.out.println(responseEntity.toString());
	*/
	        System.out.println("Token : "+webResourceGet);
	        
	        System.out.println("Nom: "+producte.getNom());
	        
	        /*for(Producte item: productes) {
	        	System.out.println(item.getId());
	        	System.out.println(item.getNom());
	        }*/
	}

}
