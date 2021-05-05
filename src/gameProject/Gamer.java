package gameProject;

public class Gamer {
	private int id;
	private String name;
	private String lastName;
	public String nationalId;
	int birthDate;
	
	
	public Gamer() {
		
	}


	public Gamer(int id, String name, String lastName, int birthDate,String nationalId ){
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.nationalId= nationalId; 
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	
	
	
}