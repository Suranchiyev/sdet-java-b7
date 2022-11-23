package day43;

public class Parrot extends Bird {
	public void talk() {
		System.out.println("Parrot is talking");
	}
	
	@Override
	public void fly() {
		// super refers to the parent object
		// call parent class Bird fly method
		super.fly();
		
		System.out.println("Parrot " + name + " is flying"); 
	}
	
	public static void main(String[] args) {
		Parrot parrot = new Parrot();
		parrot.name = "Kesha";
		parrot.fly();
	}
}
