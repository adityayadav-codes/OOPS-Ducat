// Non-Static Data Member
public class Tcs {
	
	int id;
	String name;
	int salary;
	String cname;
	
	void store(int id1, String name1, int salary1, String cname1) {
		
		id = id1;
		name = name1;
		salary = salary1;
		cname = cname1;
	}
	void show (){
		
		System.out.println("Employee Details—————");
		System.out.println("Id : " +id);
		System.out.println("Name : " +name);
		System.out.println("Salary : " +salary);
		System.out.println("Company Name : "+cname);	
		System.out.println("==========================");
}
	public static void main(String args []) {
		
		//Employee 1:
		Tcs emp1 = new Tcs();
		emp1.store(101, "Aditya Yadav", 28823, "Tcs");
		emp1.show();
		
		//Employee 2:
		Tcs emp2 = new Tcs();
		emp2.store(102, "Akash Yadav", 32322, "Tcs");
		emp2.show();

		//Employee 3:
		Tcs emp3 = new Tcs();
		emp3.store(103, "Anil Yadav", 32322, "Tcs");
		emp3.show();
	}
}
