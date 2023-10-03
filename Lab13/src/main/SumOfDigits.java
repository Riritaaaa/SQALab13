package main;

public class SumOfDigits {
	
	public int sumOfDigits(int number){
		int sum = 0;

		while (number > 9) {
			while (number != 0) {
				int digit = number % 10; // Get the last digit
				sum += digit; // Add the last digit to the sum
				number /= 10; // Remove the last digit
			}
		}
		return sum;
	}
	
}
