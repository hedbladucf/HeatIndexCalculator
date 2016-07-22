/* Oscar Hedblad
 * COP3330, 0002A
 * 
 * DESCRIPTION: The program takes in input from the user, first a temperature in degrees Fahrenheit,
 * followed by the humidity expressed as a percentage. The program then calculates what temperature
 * it actually "feels" like outside.  
 */



// Import Scanner in order to be able to scan the users entries.
import java.util.Scanner;


public class heatIndexCalculatorTester {

	
	// MAIN METHOD
	public static void main(String[] args) {
		
		// Declare a scanner called keyboard.
		Scanner keyboard = new Scanner(System.in);
		// Ask the user for a temperature entry, then store the entry in input1.
		System.out.println("Enter current temperature in fahrenheit: ");
		int input1 = keyboard.nextInt();
		
		// Ask the user for a second entry, for humidity, then store the entry in input2.
		System.out.println("Enter current humidity as a percentage: ");
		double input2 = keyboard.nextDouble();
		
		
		// Passes input1 and input2 to the heatIndexCalculator.
		heatIndexCalculator heatCalc = new heatIndexCalculator(input1, input2);
		

	}

}
