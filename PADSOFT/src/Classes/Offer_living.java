package Classes;

import java.time.LocalDate;

public class Offer_living extends Offer{
	
	private double priceMonth;
	private int numMonths;
	
	

	public Offer_living(LocalDate startingDate, double deposit, House house, double priceMonth, int numMonths) {
		
		super(startingDate, deposit, house);
		this.priceMonth = priceMonth;
		this.numMonths = numMonths;
		
	
	}
	
	
	
	
	
	
	


}
