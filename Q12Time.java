package quiz1;

import java.util.Scanner;

public class Q12Time {
	// Function to compute angle counterclockwise between hands
    public static double computeAngle(double hours, double minutes) {
    	// Declare a double to get a more accurate value
    	// Normalize hours and minutes to be within the valid range
    	// And calculate the angle in degrees
    	double hour_hand = (hours % 12) * 30;
    	hour_hand += minutes / 2;
    	double min_hand = minutes * 6;
    	
    	double result;
    	
    	// Calculate the smaller angle (either angle difference or 360 - angle difference
    	if (hour_hand < min_hand) {
    		result = 360 - Math.abs(hour_hand - min_hand);
    	} else {
    		result = Math.abs(hour_hand - min_hand);
    	}

    	return result;
    }

    public static void main(String[] args) {
    	// Takes input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the hour (0-24): ");
        double hours = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the minutes (0-60): ");
        double minutes = Double.parseDouble(scanner.nextLine());

        double angle = computeAngle(hours, minutes);
        
        // Round the angle otherwise we will have a decimal value + a less accurate answer (e.g. 254.5°)
        System.out.println("Angle at " + (int)hours + ":" + (int)minutes + " = " + (Math.round(angle / 2) * 2) + "°");

        scanner.close();
    }
}
