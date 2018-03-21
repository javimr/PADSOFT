package Classes;



public abstract class User{
	
	private int id;
	private String password;
	private String name;
	private String surname;
	private int creditCard;
	private boolean banned;
	private boolean registered;
	private Profile profileGuest;
	private Profile profileHost;
	
	public User(int id, String password, String name, String surname, String role, int creditCard) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.creditCard = creditCard;
		this.banned = false;
		this.registered = false;
		
		if(role.equals("O")){
			this.profileHost = new Profile();
			this.profileGuest = null;
		}
		if(role.equals("D")){
			this.profileGuest = new Profile();
			this.profileHost = null;
		}
		if(role.equals("OD")){
			this.profileGuest = new Profile();
			this.profileHost = new Profile();
		}
		
	}
	
	
	
	
	
	
	

}
