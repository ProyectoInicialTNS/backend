package com.tns.backend.persistence;

import java.util.Date;
import java.util.List;

import javax.inject.Named;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tns.backend.model.Flight;

@Named("persistenceFlightDaoHibernateImp")
public class PersistenceFlightDaoHibernateImp implements PersistenceFlightDao{


	@SuppressWarnings("unchecked")
	@Override
	public List<Flight> getAllFlights() {
		SessionFactory sessionFactory = SessionFactoryTNS.getSessionFactory();
		Session s=sessionFactory.openSession();
		return s.createQuery("from Flight").list();
	}

	@Override
	public void populateDB() {
		SessionFactory sessionFactory = SessionFactoryTNS.getSessionFactory();
		Session s=sessionFactory.openSession();
        Transaction tx=s.beginTransaction();
        Flight avianca = new Flight(new Date(1538550000000L),50000L,1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogota", "Cartagena");
        Flight avianca1 = new Flight(new Date(1538550000000L),10000L,1,"Avianca","https://static.iris.net.co/semana/upload/images/2016/6/2/476136_1.jpg",
                "Chia", "Cartagena");
        Flight avianca2 = new Flight(new Date(1538550000000L),200000L,1,"Avianca","http://static.iris.net.co/dinero/upload/images/2017/9/11/249725_1.jpg",
                "Bogota", "Medellin");
        Flight vivaCol = new Flight(new Date(1538550000000L),300000L,1,"Viva Colombia","https://static.iris.net.co/semana/upload/images/2018/1/3/552375_1.jpg",
                "España", "Colombia");
        Flight vivaCol1 = new Flight(new Date(1538550000000L),400000L,1,"Viva Colombia","https://static.iris.net.co/semana/upload/images/2014/3/28/381808_141753_1.png",
                "Colombia", "Peru");
        s.save(avianca);
        s.save(avianca1);
        s.save(avianca2);
        s.save(vivaCol);
        s.save(vivaCol1);
        tx.commit();    
        s.close();
        sessionFactory.close();
	}
			
			
}
