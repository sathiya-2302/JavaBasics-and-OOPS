package oops.AuthorAndBook_Advanced;

public class Author {
	private String Name="";
	private String Email="";
	private char Gender;

	Author(String Name,String Email,char gender){
		this.Name=Name;
		this.Email=Email;
		this.Gender=gender;
	}

	public  String getName() {
		return Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmial() {
		this.Email=Email;
		
	}
	public char getGender() {
		return Gender;
	}

	public String toString() {
		return "Author[name="+this.Name+",email="+this.Email+",gender="+this.Gender+"]";
	}

}