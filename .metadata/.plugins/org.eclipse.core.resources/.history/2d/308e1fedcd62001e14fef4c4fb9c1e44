package main;

public class SumOfDigits {
	
	// Check if number is positive
	public int checkPositive(int number) {
		if (number > 0) {
			number = oneDigit(number);
		}else{
			number = 0;
		}
		return number;
	}

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
		
	// make number to one-digit
	public int oneDigit(int number) {
		while (number >= 10) {
			number = sumOfDigits(number);
		}
		return number;
	}
	
	// return result
	public int getOneDigit(int number) {
		int result;
		result = checkPositive(number);
		return result;
	}

}
