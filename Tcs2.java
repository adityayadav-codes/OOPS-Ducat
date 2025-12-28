// public class Tcs2{
//     int id;
//     String name;
//     int salary;
//     static String cname = "Tcd";


//     void store(int id, String name, int salary) {
//         this.id = id;
//         this.name = name;
//         this.salary = salary;
//     }
//     void show () {
//         System.out.println("Employee Details—————");
//         System.out.println("Id : " + id);
//         System.out.println("Name : " + name);
//         System.out.println("Salary : " + salary);
//         System.out.println("Company Name : " + cname);
//         System.out.println("==========================");
//     }
//     public static void main (String args []) {
//         Tcs2 emp1 = new Tcs2();
//         emp1.store(101, "Aditya Yadav", 28823);
//         emp1.show();
//         Tcs2 emp2 = new Tcs2();
//         emp2.store(102, "Akash Yadav", 32322);
//         emp2.show();
//         Tcs2 emp3 = new Tcs2();
//         emp3.store(103, "Anil Yadav", 32322);           
//         emp3.show();
//     }
// }


/*
    Data Shoding------
*/
public class Tcs2 {
    int id ;
    String name;
    int salary;
    static String cname = "Tcs";
    void store (int id, String name, int salary,Tcs2 emp)  {

        emp.id = id;
        emp.name = name;
        emp.salary = salary;
        
    }
    void show () {
        System.out.println("Employee Details—————");
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Company Name : " + cname);
        System.out.println("==========================");
    }
    public static void main(String args []) {
        Tcs2 emp1 = new Tcs2();
        emp1.store(101, "Aditya Yadav", 28823,emp1);
        emp1.show();
        Tcs2 emp2 = new Tcs2();
        emp2.store(102, "Akash Yadav", 32322,emp2);
        emp2.show();
        Tcs2 emp3 = new Tcs2();
        emp3.store(103, "Anil Yadav", 32322,emp3);           
        emp3.show();
    }
}