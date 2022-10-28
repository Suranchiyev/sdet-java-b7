package day25;

// TODO 
// 1. Change this class to have these properties(instance variables)
//    firstName(string), lastName(string), grade(double) 
// 2. Create constructor to assign those values
// 3. Create method that prints all object's properties

public class Student {
	public String firstName;
	public String lastName;
	public double grade;
	
	public Student(String firstName, String lastName, double grade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
	}
	
	public void display() {
		System.out.println("first name: " + firstName);
		System.out.println("last name: " + lastName);
		System.out.println("grade: " + grade);
	}
}
