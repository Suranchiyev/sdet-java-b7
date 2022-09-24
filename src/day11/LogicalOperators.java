package day11;

public class LogicalOperators {
	public static void main(String[] args) {
		// && - logical AND
		// || - logical OR
		// !  - logical NOT
		
		int age = 7;
		// when we use AND, it will be true when all conditions are true
		// check if age is even and greater than 5
		
		//       false  AND true -> false
		if (age % 2 == 0 && age > 5) {
			System.out.println("in line 13");
		} else {
			System.out.println("in line 15");
		}		
		
		// when we use OR, it will be true when one of them is true
		// check if number is 7 or 13
		//    
		if (age == 7 || age == 13) {
			System.out.println("in line 22");
		} else {
			System.out.println("in line 24");
		}
		
		// ! NOT will reverse value of boolean
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);
		
		b = false;
		System.out.println(!b);
		System.out.println("-------");
		
		// false || true || false => true
		// false && true && true  => false
		// !true                  => false
		// !false                 => true
		
		// TODO 
		//           false   OR     true 
		boolean a = (2 == 1) || (true && 4 >= 3);
		System.out.println(a); // true
		
		//   true AND true -> true 
		b = !false && true;
		System.out.println(b); // true
		
		//                true   AND false -> false
		boolean c = (20 % 2 == 0) && !(5 / 2 <= 2);
		System.out.println(c); // false
		
	}
}
