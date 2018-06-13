package com.tns.backend.persistence;

import java.util.List;

import com.tns.backend.model.Flight;
import com.tns.backend.model.User;

public interface PersistenceUserDao {

	/**
	 * Obtiene todos los vuelos de un usuario dado
	 * @param cedule, la cedula del usuario
	 * @return una lista con los vueloss
	 */
	public List<Flight> getAllUserFlights(long cedule);
	
	/**
	 * Asigna un vuelo dado a un usuario, si el usuario no existe, el usuario es creado.
	 * No puede ser asignado cuando ya tiene un vuelo en la misma fecha
	 * @param cedule, la cedula del usuario
	 * @param flight, el vuelo
	 * @return true si pudo asignarlo, false de lo contrario
	 */
	public boolean joinFlight(long cedule,Flight flight);

}
