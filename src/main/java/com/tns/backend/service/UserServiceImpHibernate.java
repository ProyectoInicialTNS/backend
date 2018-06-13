package com.tns.backend.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.tns.backend.model.Flight;
import com.tns.backend.model.User;
import com.tns.backend.persistence.PersistenceFlightDao;
import com.tns.backend.persistence.PersistenceUserDao;

@Named("userServiceImpHibernate")
public class UserServiceImpHibernate implements UserService{

	@Inject
    @Named("persistenceUserDaoHibernateImp")
	private PersistenceUserDao persistenceUserDao;
	
	
	@Override
	public List<Flight> getAllUserFlights(long cedule) {
		System.out.println("En service--------------");
		return persistenceUserDao.getAllUserFlights(cedule);
	}

	@Override
	public boolean joinFlight(long user,Flight flightId) {
		return persistenceUserDao.joinFlight(user,flightId);
	}

}
