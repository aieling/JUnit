package com.helenekev.models;

import org.junit.Assert;
import org.junit.Test;

import com.helenekev.dice.Dice;

public class RollTest {

	//template method definition
	private void test(Integer numberOfFaces) {
		//given
		Integer unexpected = null;
		Dice dice = new Dice(numberOfFaces);
		
		//when
		dice.roll();
		Integer actual = dice.getCurrentFaceValue();
		
		//then
		Assert.assertNotEquals(unexpected,actual);
	}
	
	@Test
	public void test0() {test(2); }

	@Test
	public void test1() { test(3);}
	
	@Test(expected=NullPointerException.class)
	public void test2() { test(null);}
}
