package quiz1;

public class Q16Fraction {
	private int numerator;
	private int denominator;
	
	// Constructor to define a function by num and den
	Q16Fraction(int num, int den) {
		this.numerator = num;
		this.denominator = den;
	}
	
	// Get the current numerator value
	public int getNumerator() {
		return this.numerator;
	}
	
	// Get the current denominator value
	public int getDenominator() {
		return this.denominator;
	}
	
	// Format the fraction to a string with a /
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
	
	// Private function to get a GCD
	private int getGCD(int num1, int num2) {
		if (num2 == 0) {
	        return num1;
	    }
	    return getGCD(num2, num1 % num2);
	}
	
	// Get the sum of two fractions
	public String getSum(Q16Fraction fraction) {
		int num = fraction.getNumerator();
		int den = fraction.getDenominator();
		
		int numerators = (this.numerator * den) + (num * this.denominator);
		int denominators = this.denominator * den;
		
		int gcd = getGCD(num, den);
		numerators = numerators / gcd;
	    denominators = denominators / gcd;
	    
	    return numerators + "/" + denominators;
	}
	
	// Get the product of two fractions
	public String getProduct(Q16Fraction fraction) {
		int num = fraction.getNumerator();
		int den = fraction.getDenominator();
		
		int numerators = this.numerator * num;
		int denominators = this.denominator * den;
		
		int gcd = getGCD(num, den);
		numerators = numerators / gcd;
	    denominators = denominators / gcd;
	    
	    return numerators + "/" + denominators;
	}
}
