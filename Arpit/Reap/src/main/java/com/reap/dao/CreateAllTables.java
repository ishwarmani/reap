package com.reap.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateAllTables {

	public static void main(String[] args) {
		
		EmployeeDAO emp= new EmployeeDAO();
		emp.setEmployeeId("INT-16/23");
		BadgesPointsRecordsDAO bpr= new BadgesPointsRecordsDAO();
		bpr.setEmployeeId("INT-16/22");
		//emp.getRecords().setEmployeeId("INT-16/23");
		//emp.getRecords().setBronzeBadges(6);
		SessionFactory sessionFactory =new Configuration().configure("hybernate.cfg.xml").buildSessionFactory();
	 	Session session =sessionFactory.openSession();
		session.beginTransaction();
		session.save(emp);
		session.save(bpr);
		session.getTransaction().commit();	
		session.close();

	}

}
