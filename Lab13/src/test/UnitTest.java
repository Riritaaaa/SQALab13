package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.SumOfDigits;

class UnitTest {

	SumOfDigits sum_of_digits;
	
	@BeforeEach
	void setUp() throws Exception {
		sum_of_digits = new SumOfDigits();
	}
	
	@Test
	@DisplayName("TC01 : Valid Min Input = 10, Expected = 1")
	void testValidMinInput() {
		int num = 10;
		int actual = sum_of_digits.getOneDigit(num);
		assertEquals(1,actual);
	}
	
	@Test
	@DisplayName("TC02 : Valid Max Input = 999999999, Expected = 9")
	void testValidMaxInput() {
		int num = 999999999; //9 digits
		int actual = sum_of_digits.getOneDigit(num);
		assertEquals(9,actual);
	}
	
	@Test
	@DisplayName("TC03 : Valid Medium 55555")
	void testValidMedInput() {
		int num = 55555; //5 digits
		int actual = sum_of_digits.getOneDigit(num);
		assertEquals(7,actual);
	}

}
