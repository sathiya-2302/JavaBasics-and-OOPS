package oops.Person;

public class Person {
private String Name;
private String Address;

Person(String Name,String Address){
	this.Name=Name;
	this.Address=Address;
}

public String getName() {
	return Name;
}

public String Address() {
	return Address;
}

public void setAddress(String Address) {
	this.Address=Address;
}
public String toString() {
	return "Person[name="+Name+",Address="+Address+"]";
}
}
