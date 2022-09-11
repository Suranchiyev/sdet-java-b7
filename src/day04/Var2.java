package day04;

public class Var2 {
	public static void main(String[] args) {
		String firstName = "John";
		String lastName = "Doe";
		
		// John Doe
		//                    "John" + " " + "Doe"
		System.out.println(firstName + " " + lastName);
		
		//                       "John Doe"             
		String fullName = firstName + " " + lastName;
		System.out.println(fullName); // John Doe
		
		firstName = "Alex";
		lastName = "Rodriguez";
		
		System.out.println(firstName); // Alex
		System.out.println(lastName); // Rodriguez
		
		System.out.println(fullName); // John Doe
		
		// BREAK TILL 11:21AM EST
	}
}
