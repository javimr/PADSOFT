package Classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Offer {
	
	private House house;
	private LocalDate startingDate;
	private double deposit;
	private List<Comment> comments;
	private Reserve reserve;
	private StatusOffer status;
	
	public Offer(LocalDate startingDate, double deposit, House house){

		this.startingDate = startingDate;
		this.deposit = deposit;
		this.house = house;
		this.comments = new ArrayList<Comment>();
		this.reserve = null;
		this.status = StatusOffer.WAITING;
		
			
	}
	
	public void cancelOffer(){
		this.status = StatusOffer.REJECTED;
	}
	
	public void acceptOffer(){
		this.status = StatusOffer.ACCEPTED;
	}
	
	public void askChangesOffer(){
		this.status = StatusOffer.CHANGES;
	}
	
	
	
	
	

	
	
	

	
	
	
	
	
	
	
	
	

}
