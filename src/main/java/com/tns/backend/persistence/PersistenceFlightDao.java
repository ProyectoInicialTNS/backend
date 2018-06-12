package com.tns.backend.persistence;

import java.util.List;

import com.tns.backend.model.Flight;

public interface PersistenceFlightDao {
	
	/**
	 * Obtiene todos los vuelos
	 * @return una lista con los vueloss
	 */
	public List<Flight> getAllFlights();

	/**
	 * Puebla la base de datos con al menos 5 vuelos
	 */
	public void populateDB();
}
