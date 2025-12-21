// Static Data Member
class Tcs1 {
	
	int id;
	String name;
	int salary;
	static String cname = "Tcs";
	
	void store(int id1, String name1, int salary1) {
		
		id = id1;
		name = name1;
		salary = salary1;	
	}
	void show() {
		
		
		System.out.println("Id  : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Company Name : "+cname);
		System.out.println("=======================");
	}
    public static void main(String args []) {

		System.out.println("Employee Details --------------");
		//Employee 1:
		Tcs1 emp1 = new Tcs1();
		emp1.store(101, "Aditya Yadav", 32322);
		emp1.show();

		//Employee 2:
		Tcs1 emp2 = new Tcs1();
		emp2.store(102, "Akash Yadav", 34322);
		emp2.show();

		//Employee 3:
		Tcs1 emp3 = new Tcs1();
		emp3.store(104, "Anil Yadav", 54533);
		emp3.show();

	}
}