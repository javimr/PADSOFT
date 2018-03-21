package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class House {
	
	private Host host;
	private String description;
	private Integer zipcode;
	private String location;
	private HashMap<String,String> characteristics = new HashMap<String,String>();
	private List<Offer>  offers;
	/**
	 * @param description
	 * @param zipcode
	 * @param location
	 * @param characteristics
	 */
	public House(Host host,String description, Integer zipcode, String location) {
		
		this.host = host;
		this.description = description;
		this.zipcode = zipcode;
		this.location = location;
		this.offers = new ArrayList<Offer>();
	}
	
	public void addCharac(String nombre, String valor){
		
		this.characteristics.put(nombre, valor);
		
	}
	
	public String printCharac(){
		
		String characs = "";
		
		for(@SuppressWarnings("rawtypes")
		Iterator it = characteristics.keySet().iterator(); it.hasNext();){
			
			String s = (String) it.next();
			String s1 = (String) characteristics.get(s);
			characs += "Nombre:" + s + "- Valor" + s1;
		}
		
		return characs;
	}
	
	public boolean  addOffer(Offer offer){
		if(offers.contains(offer)){
			return false;
			}
		offers.add(offer);
		return true;
		
	}
	


	public String toString() {
		return "House [description=" + description + ", zipcode=" + zipcode
				+ ", location=" + location + ", characteristics = " + printCharac() + "]";
	}
	
	
	

}
