package day46;

public class Car {
	public String model;
	public double speed;
	
	public void drive() {
		System.out.println("Car is driving");
	}
	
	public void stop() {
		System.out.println("Car is stopped");
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == null || !(other instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		return this.model.equals(otherCar.model);
	}
}
