package quiz1;

import java.util.Scanner;

public class Q11Fraction {
	public static int findGCD(int num1, int num2) {
	    if (num2 == 0) {
	        return num1;
	    }
	    return findGCD(num2, num1 % num2);
	}

	// java function to add two fractions
	public static String Operation(int mode, int num1, int num2, int den1, int den2) {
	    int num = 0, den, gcd;
	    
	    // If mode == 1, we're doing addition, else multiplication
	    if (mode == 1) {
	    	num = (num1 * den2) + (num2 * den1);
	    } else if (mode == 2) {
	    	num = num1 * num2;
	    }
	    den = den1 * den2;
	    
	    // Get the GCD to simplify the fraction
	    gcd = findGCD(num, den);
	    num = num / gcd;
	    den = den / gcd;
	    
	    return num + "/" + den;
	}
	public static void main(String[] args) {
		// Takes input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type your first fraction (Numerator, denominator):");
		int num1 = input.nextInt();
		int den1 = input.nextInt();
		
		System.out.println("Now your second fraction:");
		int num2 = input.nextInt();
		int den2 = input.nextInt();
		
		// Operate and print accordingly
		String add_res = Operation(1, num1, num2, den1, den2);
		String mult_res = Operation(2, num1, num2, den1, den2);
		System.out.println("Addition: " + add_res + "\n" + "Multiplication: " + mult_res);
		
		input.close();
	}
}
