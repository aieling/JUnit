package org.perscholas.junitbasics;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JUnitBasicsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory  = Persistence.createEntityManagerFactory("JUnit Test");
		EntityManager manager = factory.createEntityManager();
//		manager.getTransaction().begin();
//	
//		
//		manager.getTransaction().commit();
		manager.close();
		factory.close();
		System.out.println("toto");
	}

}
