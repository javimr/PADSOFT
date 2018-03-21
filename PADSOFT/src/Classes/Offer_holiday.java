package Classes;

import java.time.LocalDate;

public class Offer_holiday extends Offer {
	
	private LocalDate finalDay;
	private double totalprice;
	
	
	public Offer_holiday(LocalDate startingDate, double deposit,House house , LocalDate finalDay, double totalprice) {
		
		super(startingDate, deposit, house);
		this.finalDay = finalDay;
		this.totalprice = totalprice;
		
		
	}
	
	
	
	
	
	

	
	
	

}
