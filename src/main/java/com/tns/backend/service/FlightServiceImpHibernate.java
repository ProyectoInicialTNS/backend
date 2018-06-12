package com.tns.backend.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.tns.backend.model.Flight;
import com.tns.backend.persistence.PersistenceFlightDao;

@Named("flightServiceImpHibernate")
public class FlightServiceImpHibernate implements FlightService{

	public FlightServiceImpHibernate() {
		super();
	
	}
	
	@Inject
    @Named("persistenceFlightDaoHibernateImp")
	private PersistenceFlightDao persistenceFlightDao;
	
	
	@Override
	public List<Flight> getAllFlights() {
		return persistenceFlightDao.getAllFlights();
	}

}
