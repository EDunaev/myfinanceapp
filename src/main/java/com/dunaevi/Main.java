package com.dunaevi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dunaevi.entity.FamilyMember;
import com.dunaevi.entity.Student;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(FamilyMember.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			List<FamilyMember> members = session.createQuery("from FamilyMember").getResultList();

			// commit transaction
			session.getTransaction().commit();
			
			members.forEach(s -> System.out.println(s.getName()));

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

}

