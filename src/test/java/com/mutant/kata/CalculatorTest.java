package com.mutant.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void shouldReturnZeroOnEmptyInput(){
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void shouldReturnNumberOnSingleInput(){
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void shouldReturnSumOfTwoNumbersCommaDelimiter(){
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void shouldReturnSumOfTwoNumberHashDelimiter(){
		assertEquals(3, Calculator.add("1#2"));
	}

	@Test
	public void shouldWorkWithThreeNumbers(){
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionInCaseOfNegativeNumber(){
		Calculator.add("1,-2,3");
	}

	@Test
	public void shouldIgnoreNumbersBiggerThenThousand(){
		assertEquals(6, Calculator.add("1,2,1001,3"));
	}

	@Test
	public void shouldTakeDelimiterFromFirstPart(){
		assertEquals(6, Calculator.add("//_1_2_3"));
	}

	@Test
	public void shouldWorkWithMuktiCharsDelimiter(){
		assertEquals(6, Calculator.add("//[&&]1&&2&&3"));
	}


}
