package Classes;


import java.util.Date;

public class Reserve {
	
	private Date dateini;
	private Date dateend;
	
	/**
	 * @param dateini
	 * @param dateend
	 */
	
	
	public Reserve(Date dateini, Date dateend) {
		this.dateini = dateini;
		this.dateend = dateend;
		
	}

	public Date getDateini() {
		return dateini;
	}

	public void setDateini(Date dateini) {
		this.dateini = dateini;
	}

	public Date getDateend() {
		return dateend;
	}

	public void setDateend(Date dateend) {
		this.dateend = dateend;
	}

	
	/**
	 * @return
	 */
	
	public boolean isExpired(){
		
		int days = (int) ((dateini.getTime() - dateend.getTime())/86400000);
		
		if(days < 5){
			return false;
		}
		
		return true;
	}
	
	
	
	
	

	
	

}


