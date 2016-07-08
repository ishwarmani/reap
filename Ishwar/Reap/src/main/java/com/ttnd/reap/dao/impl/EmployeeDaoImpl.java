package com.ttnd.reap.dao.impl;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.ttnd.reap.model.Employee;
import com.ttnd.reap.model.GivingKitty;
import com.ttnd.reap.model.Karma;
import com.ttnd.reap.model.RecievedKitty;
import com.ttnd.reap.model.UserRole;
import com.ttnd.reap.model.WallOfFame;

public class EmployeeDaoImpl {
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setName("Raghu");
		employee.setEmail("raghu@tothenew.com");
		employee.setEmployeeID("IT-16-01");
		GivingKitty givingKitty = new GivingKitty();
		givingKitty.setGold(3);

		RecievedKitty recievedKitty = new RecievedKitty();
		recievedKitty.setGold(1);

		Karma karma = Karma.Extra_Miler;
		UserRole userRole = UserRole.USER;
		
		employee.setUserRole(userRole);
		
		WallOfFame fame = new WallOfFame();
		fame.setDate(new Date());
		fame.setKarma(karma);
		
		Configuration configuration = new Configuration();
		SessionFactory factory = configuration.configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		session.save(employee);
		session.save(givingKitty);
		session.save(recievedKitty);
		session.save(fame);

		session.getTransaction().commit();
		session.close();
	}
}
