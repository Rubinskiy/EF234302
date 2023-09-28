package quiz1;

public class Q15Weight {
	// Double because a pound doesn't necessarily equal a whole number in kg
	private double pound;
	private double kilo;
	
	// Constructor to take pounds input and set to pound
	// Sets kilo to pounds * 0.45359237
	Q15Weight(double pounds) {
		this.pound = pounds;
		this.kilo = this.convertToKilo(pounds);
	}
	
	// Convert pounds to kilo
	public double convertToKilo(double pounds) {
		return pounds * 0.45359237;
	}
	
	// Getters for pounds and kilos
	public double getPounds() {
		return pound;
	}
	
	public double getKilo() {
		return kilo;
	}
}
