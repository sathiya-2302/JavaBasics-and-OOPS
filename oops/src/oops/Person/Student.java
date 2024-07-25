package oops.Person;

public class Student extends Person {
private  String program;
private int year;
double fee;
	Student(String Name, String Address,String program,int year,double fee) {
		super(Name, Address);
		this.program=program;
		this.year=year;
		this.fee=fee;
		
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program=program;
	}
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	
	public double getFee() {
		return fee;
	}
	
	public void setFee(Double fee) {
		this.fee=fee;
	}
	@Override
	public String toString() {
		return "student["+super.toString()+",program="+program+",year="+year+"fee="+fee+"]";
	}
}
