package day25;

public class StudentDemo {
	public static void main(String[] args) {
		// TODO
		// 1. Create 1 object with all properties
		// assigned by using 3 args constructor
		// 2. Print all properties by using the 
		//    method of that object
		
		Student student = new Student("Alex", "Rodriguez", 95);
		student.display();
		
		System.out.println(student);
		
		Student student2 = student;
		System.out.println(student2);
		
		if (student == student2) {
			System.out.println("yes");
		}
	}
}
