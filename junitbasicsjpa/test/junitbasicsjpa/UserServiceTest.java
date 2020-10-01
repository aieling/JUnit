package junitbasicsjpa;



import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.perscholas.junit.UserService;

public class UserServiceTest {
	
	@Test
	public void testLoginUser() {
		String enteredPassword = "user2abcd";
		String enteredEmail = "user2@email.com";

		UserService us = new UserService();
		boolean validLogin = us.loginUser(enteredEmail, enteredPassword);
		assertTrue(validLogin);
	}
}