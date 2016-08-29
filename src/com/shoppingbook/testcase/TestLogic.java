package com.shoppingbook.testcase;

import static org.junit.Assert.*;

import java.util.*;

import com.shoppingbook.logic.*;
import org.junit.Test;

public class TestLogic {
	@Test
	public void priceCalculationTest(){
		int[] books={1,2,2,1,0}; 
		assertEquals(40.8,Calculation.priceCalculation(books),.001);
		//assertEquals(-2,Calculation.findMax(new int[]{-12,-3,-4,-2}));
	}
}
