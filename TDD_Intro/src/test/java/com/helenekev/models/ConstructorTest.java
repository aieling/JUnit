package com.helenekev.models;

import org.junit.Assert;
import org.junit.Test;

import com.helenekev.dice.Dice;

public class ConstructorTest {
	// template method
	private void test(Integer expectedNumberOfFaces) {
		Integer expectedFaceValue = null;
		
		//when
		Dice dice = new Dice(expectedNumberOfFaces);
		Integer actualFaceValue = dice.getCurrentFaceValue();
		Integer actualNumberOfFaces = dice.getNumberOfFaces();
		
		//then
		Assert.assertEquals(expectedFaceValue, actualFaceValue);
		Assert.assertEquals(expectedNumberOfFaces, actualNumberOfFaces);
	}
	
	@Test
	public void test0() { test(3); }
	
	@Test
	public void test1() { test(4); }
	
	@Test
	public void test2() { test(6); }
}
