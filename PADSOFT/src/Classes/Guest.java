package Classes;

import java.util.ArrayList;
import java.util.List;

public class Guest extends Profile {
	private List<Reserve> reserves;
	private List<Comment> comments;
	
	public Guest(List<Reserve> reserves, List<Comment> comments){
		
		this.reserves = new ArrayList<Reserve>();
		this.comments = new ArrayList<Comment>();
	}
	
	
	
	
	

}
