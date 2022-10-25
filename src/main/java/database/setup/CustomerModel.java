package database.setup;

public class CustomerModel {
	
	private String Id;
    private String Email;
    private String Name;
    private String Gender;
    
    public String getId() {
		return Id;
	}
	public void setId(String Id) {
		this.Id = Id;
	}

	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
}
