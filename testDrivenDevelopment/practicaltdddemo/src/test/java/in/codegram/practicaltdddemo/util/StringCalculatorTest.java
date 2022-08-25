package in.codegram.practicaltdddemo.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	
	private StringCalculator stringCalculator;
	
	@Before
	public void setUp() {
		stringCalculator = new StringCalculator();
	}

	//1: input : empty string, output : 0
	
	@Test
	public void claculate_GivenEmptyString_ShouldReturnZeroAsInt() {
		int result = stringCalculator.calculate("");
		assertEquals(0, result);
	}
	
	//2: input : "1", output : 1
	
	@Test
	public void calculate_Given1AsString_ShouldReturn1AsInt() {
		int result = stringCalculator.calculate("1");
		assertEquals(1, result);
	}
	
	//3: input : "1", output : 1
	
	@Test
	public void calculate_Given1and2SeparatedByCommaAsString_ShouldReturn3AsInt() {
		int result = stringCalculator.calculate("1,2");
		assertEquals(3, result);
	}
	
	@Test(expected = NumberFormatException.class)
	public void calculate_GivenAandBSeparatedByComma_ThrowsNumberFormatException() {
		int result = stringCalculator.calculate("A,B");
	}
	
}
