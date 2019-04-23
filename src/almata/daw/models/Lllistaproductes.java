package almata.daw.models;

import java.util.List;




public class Lllistaproductes {
	
	public List<Producte> productes;
	
	

	public Lllistaproductes() {
		
	}
	public Lllistaproductes(List<Producte> productes) {
		super();
		this.productes = productes;
	}

	
	public List<Producte> getProductes() {
		return productes;
	}

	public void setProductes(List<Producte> productes) {
		this.productes = productes;
	}
	
	

}
