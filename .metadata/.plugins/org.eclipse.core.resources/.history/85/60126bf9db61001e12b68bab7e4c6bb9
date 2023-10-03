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
		int actual = sum_of_digits.sumOfDigits(num);
		assertEquals(1,actual);
	}

}
