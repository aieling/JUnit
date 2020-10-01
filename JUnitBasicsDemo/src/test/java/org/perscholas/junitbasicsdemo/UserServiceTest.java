package org.perscholas.junitbasicsdemo;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.perscholas.junitbasicsdemo.UserService;

public class UserServiceTest {
//	@Test
//	public void testLoginUser() {
//		String enteredPassword = "einstein";
//		String enteredEmail = "martymcfly@gmail.com";
//
//		UserService us = new UserService();
//		boolean validLogin = us.loginUser(enteredEmail, enteredPassword);
//		assertTrue(validLogin);
//	}
//	
//	@Test
//	public void testLoginUserInvalid() {
//		String enteredPassword = "toto";
//		String enteredEmail = "tofewfeto@gmail.com";
//
//		UserService us = new UserService();
//		boolean validLogin = us.loginUser(enteredEmail, enteredPassword);
//		assertFalse(validLogin);
//	}
	
//	@Test
//	public void testGetUser() {
//		
//		User userEntered = new User();
//		userEntered.setEmail("martymcfly@gmail.com");
//		userEntered.setPassword("einstein");
//		userEntered.setAddress("lyon drive hill valley");
//		userEntered.setZipcode("01012");
//		userEntered.setName("marty");
//		UserService us = new UserService();
//		User userFound = us.getUser("martymcfly@gmail.com");
//		assertEquals(userFound,userEntered);
//	}
	
	@Test
	public void testGetUserByZipcode() {
		
		User userEntered = new User();
		userEntered.setEmail("martymcfly@gmail.com");
		userEntered.setPassword("einstein");
		userEntered.setAddress("lyon drive hill valley");
		userEntered.setZipcode("01012");
		userEntered.setName("marty");
		
		User userEntered2 = new User();
		userEntered2.setEmail("doc@gmail.com");
		userEntered2.setPassword("copernic");
		userEntered2.setAddress("lyon drive hill valley");
		userEntered2.setZipcode("01012");
		userEntered2.setName("doc");
		User[] user = {userEntered2,userEntered};
		
		
		UserService us = new UserService();
		List<User> usersFound = us.getUsersByZipcode("01012");
		
		assertArrayEquals(user, usersFound.toArray());
	}
}
