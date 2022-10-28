package day27;

public class BookDemo {
	public static void main(String[] args) {
		Book bookA = new Book("10X", "Alex", 300);
		bookA.printBookDetails();
		System.out.println("---");
		
		Book bookB = bookA;
		bookB.title = "11X";
		
		bookB.printBookDetails();
		System.out.println("---");
		bookA.printBookDetails();	
		
		System.out.println(bookA == bookB); // true
		System.out.println("---");
		
		Book bookOne = new Book("OCA", "Jeanne", 500);
		Book bookTwo = new Book("OCA", "Jeanne", 500);
		
		// equal to == compares if two object references pointing to the same
		// object or not.
		
		System.out.println(bookOne);
		System.out.println(bookTwo);
		// bookOne == bookTwo 
		if (bookOne == bookTwo) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
