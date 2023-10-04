package main;

public class SumOfDigits {

	// Calculate each one-digit of number
	public int sumOfDigits(int number) {
		int sum = 0;
		while (number != 0) {
			int digit = number % 10; // Get the last digit
			sum += digit; // Add the last digit to the sum
			number /= 10; // Remove the last digit
		}
		return sum;
	}

	// Check if number is one-digit and return the result
	public int getOneDigit(int number) {
		if (number > 0) {
			while (number >= 10) {
				number = sumOfDigits(number);
			}
			return number;
		}else{
			return 0; // return 0 if number is nagative
		}
	}

}
