package com.sample.maths.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	Calculator calc=new Calculator();
	
	/*
	 * Calculate squares of number like
	 * 1- 1*1=1
	 */
	@Test
	public void testSquares(){
		assertEquals(calc.square(5),5*5);
		assertEquals(calc.square(25),25*25);
	}
	
	@Test
	public void testSumOfNumbers(){
		assertEquals(calc.sumofnumbers(10, 10), 10+10);
	}
	
	
}
