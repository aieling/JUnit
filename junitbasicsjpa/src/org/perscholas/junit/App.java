package org.perscholas.junit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory  = Persistence.createEntityManagerFactory("junitbasicsjpa");
		EntityManager manager = factory.createEntityManager();
		
			String enteredEmail = "user2@email.com";
			String enteredPassword = "user2abcd";
			
			UserService us = new UserService();
//			User newUser = new User();
//			newUser.setEmail("user2@email.com");
//			newUser.setName("New User2");
//			newUser.setAddress("123 Main St., Boston");
//			newUser.setState("MA");
//			newUser.setZipcode("01702");
//			newUser.setPassword("user2abcd");
//			us.createUser(newUser);
			boolean validLogin = us.loginUser(enteredEmail, enteredPassword);
			System.out.println(validLogin);
	}

}
