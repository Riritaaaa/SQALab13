package main;

public class SumOfDigits {
<<<<<<< HEAD
	public int SumOfDigits(int number) {
=======
	
	public int sumOfDigits(int number){
>>>>>>> 69783f84be6d5c2db5280c21f72df557880a7b6a
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
