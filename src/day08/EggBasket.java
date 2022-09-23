package day08;

import util.InputFromUser;

public class EggBasket {
	public static void main(String[] args) {
		int numberOfBaskets, eggsPerBasket, totalEggs;
		// TODO
		// Change this code so numberOfBaskets and eggsPerBasket values
		// will come from the console
		
		String numberOfBasketsStr = InputFromUser.getInput("Enter number of baskets:");
		String eggsPerBasketStr = InputFromUser.getInput("Enter eggs per basket:");
		
		numberOfBaskets = Integer.parseInt(numberOfBasketsStr);
		eggsPerBasket = Integer.parseInt(eggsPerBasketStr);
		
		totalEggs = numberOfBaskets * eggsPerBasket;
		
		System.out.println("if you have");
		System.out.println(eggsPerBasket + " eggs per basket and");
		System.out.println(numberOfBaskets + " baskets, then");
		System.out.println("The total number of eggs is " + totalEggs);
	}
}
