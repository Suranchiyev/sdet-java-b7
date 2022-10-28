package day26;

public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		
		Student sOne = new Student("John", "Doe", "B7", 80.5);
		System.out.println(sOne.firstName); // John
		System.out.println(sOne.lastName); // Doe
		System.out.println(sOne.course); // B7
		System.out.println(sOne.grade); // 80.5
		System.out.println("---");
		
		Student sTwo = new Student("Alex", "Rod", "B8", 90);
		System.out.println(sTwo.firstName); // 
		System.out.println(sTwo.lastName); // 
		System.out.println(sTwo.course); // 
		System.out.println(sTwo.grade); // 
	}
}
