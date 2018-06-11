package com.tns.backend.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryTNS {
	private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	private SessionFactoryTNS(){}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
