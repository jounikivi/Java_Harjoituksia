package kotitehtävät10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Double number, sum = 0.0;
		// Create an object Scanner
		Scanner input = new Scanner(System.in);
		
		for (int i = 1; i < 6; ++i) {
			System.out.println("Enter number " + i + " : ");
			//takes input from the user
			number = input.nextDouble();
			// if number negative
			// continue statement is executed
			if (number < 0.0) {
				System.out.println("Negative number is added to the sum.");
			}
			sum += number;
			}
		System.out.println("Sum =" + sum);
		input.close();
	}
}
