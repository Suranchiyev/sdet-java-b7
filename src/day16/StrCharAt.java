package day16;

public class StrCharAt {
	public static void main(String[] args) {
		// charAt(int index) gets specific char by index
		//            0123
		String str = "home";
		//      =    'o'
		char ch = str.charAt(1);
		
		System.out.println(ch);
		System.out.println(str);
		
		System.out.println(str.charAt(3)); // e
		System.out.println(str.charAt(0)); // h
		
		// Runtime exception - StringIndexOutOfBoundsException: String index out of range: 4
		// System.out.println(str.charAt(4)); 	
	}
}
