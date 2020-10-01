package org.perscholas.junitbasicsdemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppMain {

	public static void main(String[] args) {
//		EntityManagerFactory factory  = Persistence.createEntityManagerFactory("JUnitBasicsDemo");
//		EntityManager manager = factory.createEntityManager();
//		User newuser = new User();
		UserService us = new UserService();
//		newuser.setEmail("doc@gmail.com");
//		newuser.setPassword("copernic");
//		newuser.setName("doc");
//		newuser.setAddress("lyon drive hill valley");
//		newuser.setZipcode("01012");
//		us.createUser(newuser);
		
		System.out.println(us.getUsersByZipcode("01012").toString());

	}

}
