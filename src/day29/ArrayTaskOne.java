package day29;

import java.util.Arrays;

public class ArrayTaskOne {
	public static void main(String[] args) {
		 int[] number = new int[3];
		 number[0] = 1;
		 number[1] = 234;
		 number[2] = 7;
		 System.out.println(number[0]);
		 System.out.println(number[1]);
		 System.out.println(number[2]);
		 
		 // TODO
		 String[] team = new String[4];
		 team[0] = "10X";
		 team[1] = "Javengers";
		 team[2] = "Eagles";
		 team[3] = "Dream coders";
		 
		 // [10X, Javengers, Eagles, Dream coders]
		 System.out.println(Arrays.toString(team));
 	}
}
