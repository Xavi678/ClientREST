package almata.daw.main;

import java.io.IOException;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

import almata.daw.models.Lllistaproductes;
import almata.daw.models.Producte;


public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		/*ObjectMapper mapper= new ObjectMapper();
		Producte producte= new Producte();
		//mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		System.out.println("Autenticar");
		Token token=mapper.readValue(new URL("http://localhost:8080/ServeiREST/api/serveiCarro/Autenticar/tito/tito"), Token.class);
	
		System.out.println(token.getId());
		
		System.out.println("Obtenir un producte");
		Producte p=mapper.readValue(new URL("http://localhost:8080/ServeiREST/api/serveiCarro/obtenirProducte/"+token.getId()+"/65"),Producte.class );
		System.out.println("Nom: "+p.getNom()+" Preu: "+p.getPreu()+" Disponibilitat: "+p.getDisponibilitat());
		
		
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		//mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
		//mapper.registerModule(new JaxbAnnotationModule());

		Lllistaproductes llista=mapper.readValue(new URL("http://localhost:8080/ServeiREST/api/serveiCarro/obtenirProductes/"+token.getId()),Lllistaproductes.class  );
		
		List<Producte> productes=llista.getProductes();
		
		System.out.println("Obtenir tots els Productes");
		int i=0;
		for(Producte item: productes) {
			System.out.println("---------");
			System.out.println("Producte "+i);
			System.out.println(item.getNom());
			System.out.println(item.getPreu());
			System.out.println(item.getDisponibilitat());
			
			i++;
		}
	//URL nova=	new URL("hh");
	
Lllistaproductes llista2=mapper.readValue(new URL("http://localhost:8080/ServeiREST/api/serveiCarro/obtenirProductes/data/"+token.getId()+"/12-03-2012/03-07-2014"),Lllistaproductes.class  );
		
		List<Producte> productes2=llista2.getProductes();
		
		System.out.println("Obtenir tots els Productes Filtrats per Data");
		int i1=0;
		for(Producte item: productes2) {
			System.out.println("---------");
			System.out.println("Producte "+i1);
			System.out.println(item.getNom());
			System.out.println(item.getPreu());
			System.out.println(item.getDisponibilitat());
			
			i1++;
		}
		*/
		
		 ClientConfig clientConfig = new DefaultClientConfig();
	        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
	        Client client = Client.create(clientConfig);

	        // GET request to findBook resource with a query parameter
	        String getToken = "http://localhost:8080/ServeiREST/api/serveiCarro/Autenticar";
	        String webResourceGet = client.resource(getToken).queryParam("nom", "admin").queryParam("passwd", "admin").accept(MediaType.APPLICATION_JSON).get(String.class);
	       /* ClientResponse response = webResourceGet.get(ClientResponse.class);
	        String responseEntity = response.getEntity(String.class);

	        if (response.getStatus() != 200) {
	            throw new WebApplicationException();
	        }

	        System.out.println(responseEntity.toString());
	*/
	        System.out.println("Token :"+webResourceGet);
	}

}
