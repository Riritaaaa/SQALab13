package main;

public class SumOfDigits {
	
	// sum each one-digit of number
	public int sumOfDigits(int number) {
		int sum = 0;
		while (number != 0) {
			int digit = number % 10; // Get the last digit
			sum += digit; // Add the last digit to the sum
			number /= 10; // Remove the last digit
		}
		return sum;
	}
		
	// check if number is positive value and make number to one-digit 
	public int getOneDigit(int number) {
		if (number <= 9) {
			number = 0;
		}
		while (number >= 10) {
			number = sumOfDigits(number);
		}
		return number;
	}
}
