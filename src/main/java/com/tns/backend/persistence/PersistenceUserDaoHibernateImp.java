package com.tns.backend.persistence;

import java.util.List;

import javax.inject.Named;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tns.backend.model.Flight;
import com.tns.backend.model.User;

@Named("persistenceUserDaoHibernateImp")
public class PersistenceUserDaoHibernateImp implements PersistenceUserDao {

	@Override
	public List<Flight> getAllUserFlights(long cedule) {
		SessionFactory sessionFactory = SessionFactoryTNS.getSessionFactory();
		Session s=sessionFactory.openSession();
		System.out.println("antes DAO--------------");
		List<Flight> res = s.load(User.class, cedule).getflightsList();
		System.out.println("despues DAO--------------");
		s.close();
		return res;
	}

	@Override
	public void createUser(User user) {
		SessionFactory sessionFactory = SessionFactoryTNS.getSessionFactory();
		Session s=sessionFactory.openSession();
		s.save(user);
		s.close();
		
	}

}
