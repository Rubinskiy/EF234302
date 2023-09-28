package quiz1;

public class Jokes {
	private static String joke_string;
	
	// Function to get the current value of joke and determine length
	public static void is_funny() {
		if (joke_string.length() < 20) {
			System.out.println("It’s funny");
		} else {
			System.out.println("It’s not funny");
		}
	}
	
	// Function to get the first word of joke
	public static void first_word() {
		String words[] = joke_string.split(" ");
		System.out.println(words[0]);
	}
	
	public static void main(String[] args) {
		joke_string = "Knock knock who's there?";
		is_funny();
		first_word();
		joke_string = "Your life";
		is_funny();
		first_word();
	}
}
