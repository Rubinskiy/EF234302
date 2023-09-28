package quiz1;

import quiz1.Q15Weight;
import java.util.Scanner;

public class Q15WeightTest {
	public static void main(String[] Args) {
		// Takes input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pounds:");
		double pounds = Double.parseDouble(input.nextLine());
		
		// Makes a new weight object and processes pounds to kilos
		Q15Weight weight = new Q15Weight(pounds);
		
		System.out.println(weight.getPounds());
		
		// Print the pounds and kilos
		System.out.println("Pounds value: " + weight.getPounds());
		System.out.println("Kilos value: " + weight.getKilo());
	}
}
