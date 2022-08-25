package in.codegram.practicaltdddemo.util;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PrimeFactorsTest {
	
	private PrimeFactors primeFactors;
	
	@Before
	public void setup() {
		primeFactors = new PrimeFactors();
	}
	
	//1: input : empty value, output:0
	
	@Test
	public void calculate_GivenEmptyIntInput_ShouldReturnZeroAsInt() {
		List<Integer> primeFactorList = primeFactors.primeFactor(0);
		List<Integer> expected  = new ArrayList<>();
		expected.add(0);
		assertArrayEquals(expected.toArray(), primeFactorList.toArray());
	}
	
	@Test
	public void calculate_Given1AsInt_ShouldReturn1AsInt() {
		List<Integer> primeFactorList = primeFactors.primeFactor(1);
		List<Integer> expected  = new ArrayList<>();
		expected.add(1);
		assertArrayEquals(expected.toArray(), primeFactorList.toArray());
	}
	
	@Test
	public void calculate_Given2AsInt_ShouldReturn2AsInt() {
		List<Integer> primeFactorList = primeFactors.primeFactor(2);
		List<Integer> expected  = new ArrayList<>();
		expected.add(2);
		assertArrayEquals(expected.toArray(), primeFactorList.toArray());
	}
	

	@Test
	public void calculate_Given_Negative_numberAsInt_ThrowNumberFormateException() {
		List<Integer> primeFactorList = primeFactors.primeFactor(1);
		List<Integer> expected  = new ArrayList<>();
		expected.add(1);
		assertArrayEquals(expected.toArray(), primeFactorList.toArray());
	}


}
