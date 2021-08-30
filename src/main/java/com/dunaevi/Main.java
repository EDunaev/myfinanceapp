package com.dunaevi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dunaevi.entity.FamilyIncome;
import com.dunaevi.entity.FamilyMember;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(FamilyMember.class).addAnnotatedClass(FamilyIncome.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			
//			List<FamilyMember> members = session.createQuery("from FamilyMember f where f.name like 'Pedros'").getResultList();
//			FamilyMember pedros = members.get(0);
//			
//			FamilyIncome fi = new FamilyIncome();
//			fi.setIncome(0);
//			
//			pedros.add(fi);
//			
//			session.saveOrUpdate(fi);
//			
//			System.out.println(pedros.getName());
			
			
			
			FamilyMember pedros = session.get(FamilyMember.class, 4);
			
			pedros.getFamilyIncomes().forEach(i -> System.out.println(i.getIncome()));
			
			FamilyIncome fi = pedros.getFamilyIncomes().get(0);
			
			fi.setIncome(0);
			
			session.saveOrUpdate(fi);
			
			session.getTransaction().commit();
			
			System.out.println(pedros.getName());
			
			
			
			
			
			
//
//			FamilyMember pedros = session.get(FamilyMember.class, 4);
//			
//			pedros.getFamilyIncomes().forEach(i -> System.out.println(i.getIncome()));
//			
//			session.delete(pedros.getFamilyIncomes().get(0));
//			
//			session.getTransaction().commit();
//			
			
			
//		List<FamilyMember> members = session.createQuery("from FamilyMember").getResultList();
//
//			// commit transaction
//			session.getTransaction().commit();
//
//			for (FamilyMember familyMember : members) {
//				System.out.println(familyMember.getName());
//				for (FamilyIncome familyIncome : familyMember.getFamilyIncomes()) {
//					System.out.println(familyIncome.getIncome());
//				}
//			}

			System.out.println("Done!");
		} finally {
			session.close();
			factory.close();
		}
	}

}
