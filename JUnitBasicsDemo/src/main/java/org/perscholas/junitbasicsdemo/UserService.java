package org.perscholas.junitbasicsdemo;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class UserService {
	public boolean loginUser(String email, String password) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JUnitBasicsDemo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		User foundUser = entityManager.find(User.class, email);
		System.out.println("email: "+email + "password : "+password+ " "+foundUser);
		
		if (foundUser !=null && foundUser.getPassword().equals(password)) {
			entityManager.close();
			entityManagerFactory.close();
			return true;
		}
		
		entityManager.close();
		entityManagerFactory.close();
		return false;
	}
	
	public String createUser(User newUser) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JUnitBasicsDemo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(newUser);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		return newUser.getEmail();
	}
	
	public User getUser(String email) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JUnitBasicsDemo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		User foundUser = entityManager.find(User.class, email);
		if(foundUser != null) {
			return foundUser;
		}
		System.out.println("user not found");
		return null;
	}
	
	public List<User> getUsersByZipcode(String zipcode) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JUnitBasicsDemo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query q = entityManager.createQuery("SELECT u FROM User u where u.zipcode = :zipcode");
		q.setParameter("zipcode", zipcode);
		List<User> usersFound = q.getResultList();
		
		if(usersFound != null) {
			return usersFound;
		}else {
			System.out.println("user not found");
			return null;
		}
	}
	
}
