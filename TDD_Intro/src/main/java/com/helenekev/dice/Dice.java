package com.helenekev.dice;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
	private Integer numberOfFaces;
	private Integer currentFaceValue;
	
	public Dice(Integer numberOfFaces) {
		this.numberOfFaces = numberOfFaces;
	}
	
	public void roll() {
		ThreadLocalRandom randomNumberGenerator = ThreadLocalRandom.current();
		Integer randomFaceValue = randomNumberGenerator.nextInt(1,numberOfFaces);
		this.currentFaceValue = randomFaceValue;
	}
	
	public Integer getCurrentFaceValue() {
		return currentFaceValue;
	}
	
	public Integer getNumberOfFaces() {
		return numberOfFaces;
	}
}
