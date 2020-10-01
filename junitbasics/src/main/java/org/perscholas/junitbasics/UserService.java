package org.perscholas.junitbasics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UserService {
	public User loginUser(String email, String password) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA test");
		EntityManager em = emf.createEntityManager();
		User foundUser = em.find(User.class, email);
		return foundUser;
	}
}
