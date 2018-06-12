package com.tns.backend.service;

import java.util.List;

import com.tns.backend.model.Flight;
import com.tns.backend.model.User;

public interface UserService {
	

	/**
	 * Obtiene todos los vuelos de un usuario dado
	 * @param cedule, la cedula del usuario
	 * @return una lista con los vueloss
	 */
	public List<Flight> getAllUserFlights(long cedule);
	
	/**
	 * crea un nuevo usuario en la base de datos
	 * @param user, el usuario a crear
	 */
	public void createUser(long user);

}