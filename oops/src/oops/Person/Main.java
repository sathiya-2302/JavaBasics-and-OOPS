package oops.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1= new Student("sam","test1","cse",2023,25000);
		System.out.println(student1);
		System.out.println("Student name and program="+student1.getName()+" "+student1.getProgram());

		Staff staff1=new Staff("saran","addrestest","abc matric school",50000);
		System.out.println(staff1);
		System.out.println("Staff name and school="+staff1.getName()+" "+staff1.getSchool());

	}

}
