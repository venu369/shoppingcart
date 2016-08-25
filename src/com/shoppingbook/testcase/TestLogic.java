package com.shoppingbook.testcase;

import static org.junit.Assert.*;

import java.util.*;

import com.shoppingbook.logic.*;
import org.junit.Test;

public class TestLogic {

	@Test
	public void testFindMax(){
		Map map=new HashMap();
		map.put("book1", "2");
		map.put("book2", "1");
		map.put("book3", "1");
		map.put("book4", "0");
		map.put("book5", "0");
		assertEquals(29.66,Calculation.priceCalculation(map));
		//assertEquals(-2,Calculation.findMax(new int[]{-12,-3,-4,-2}));
	}
}
