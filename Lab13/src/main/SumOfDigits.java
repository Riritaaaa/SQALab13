package main;

public class SumOfDigits {
	
	public int sumOfDigits(int number){
		int sum;
		while (number >= 10) {
			sum = 0;
			while (number != 0) {
				int digit = number % 10; // Get the last digit
				sum += digit; // Add the last digit to the sum
				number /= 10; // Remove the last digit
			}
			number = sum;
			return sum;
		}
	}
	
}
