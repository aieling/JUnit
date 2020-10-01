package com.helenekev.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class MainAppTest {

	@Test
	public void testGetName() {
		//given
		Person person = new Person();
		String expectedName = "Helene";
		person.setFirstName(expectedName);
		
		//when
		String actualName = person.getFirstName();
		
		//then
		Assert.assertEquals(expectedName, actualName);
		
	}

}
