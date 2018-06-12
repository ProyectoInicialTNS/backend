package com.tns.backend;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.tns.backend.persistence.PersistenceFlightDao;


@ApplicationPath("/tns")
public class Principal extends Application {
	
	@Inject
    @Named("persistenceFlightDaoHibernateImp")
	private PersistenceFlightDao persistenceFlightDao;
	
	/**
	 * Metodo usado para poblar la base de datos justo despues de su creacion
	 
	@PostConstruct
	public void postConstruct(){	
		persistenceFlightDao.populateDB();
	}*/

}


