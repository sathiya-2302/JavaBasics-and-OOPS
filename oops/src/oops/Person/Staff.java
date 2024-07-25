package oops.Person;

public class Staff extends Person {
private String school;
private double pay;
	Staff(String Name, String Address,String school,double pay) {
		super(Name, Address);
		this.school=school;
		this.pay=pay;
	}
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school=school;
	}
	public double getPay() {
		return pay;
	}
	
	public void setPay(double pay) {
		this.pay=pay;
	}
	
	@Override
	public String toString() {
		return "student["+super.toString()+",school="+school+",pay="+pay+"]";
	}
}
