package com.kiran;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class StudentCreation {

	public static void main(String[] args) {
		StudentInfo s1= new StudentInfo();
		s1.setName("Kiran");
		s1.setRoll_no(123);
		s1.setClass_room(12);
		
		StudentInfo s2= new StudentInfo();
		s2.setName("Anmol");
		s2.setRoll_no(124);
		s2.setClass_room(12);
		
		StudentInfo s3= new StudentInfo();
		s3.setName("Shubham");
		s3.setRoll_no(125);
		s3.setClass_room(12);
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("myPersistenceFile");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		et.commit();

	}

}
