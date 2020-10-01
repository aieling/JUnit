package org.perscholas.junit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserService {
	public boolean loginUser(String email, String password) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JUnit Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		User foundUser = entityManager.find(User.class, email);
		System.out.println(foundUser.getName());
		
		if (foundUser.getPassword().equals(password)) {
			entityManager.close();
			entityManagerFactory.close();
			return true;
		}
		
		entityManager.close();
		entityManagerFactory.close();
		return false;
	}
}
