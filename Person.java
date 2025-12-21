// 1. Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables.
public class Person {
	
	private String name;
	private int age;
	private String CountName;

	public void store(String name1, int age1, String CountName1) {
		
		name  	      = name1;
		age 	      = age1;
		CountName = CountName1;
	}
	public void show() {
		
		System.out.println("Name         : "+name);
		System.out.println("Age          : "+age);
		System.out.println("Country Name : "+CountName);
	}
	
	public static void main(String args []) {
	
		Person person1 = new Person();
		person1.store("Aadi", 20, "India");
		person1.show();
	}
}