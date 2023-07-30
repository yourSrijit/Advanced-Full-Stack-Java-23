package com.junit.testcase;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.junit.logic.*;

public class TestLogic {

	@Test
	public void testFindmax() {
		 assertEquals(4,Calculation.FindMax(new int[]{1,3,4,2}));  
//	        assertEquals(-1,Calculation.FindMax(new int[]{-12,-1,-3,-4,-2})); 
	}

}

