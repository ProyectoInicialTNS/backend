package com.tns.backend.controller;


import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.tns.backend.model.Flight;
import com.tns.backend.service.UserService;

@Path("/usuarios")
@Produces("application/json")
public class UserController {
	
	@Inject
    @Named("userServiceImpHibernate")
	private UserService userService;
	
	
	/**
	 * Obtiene todos los vuelos de un usuario dado
	 * @param cedule, la cedula del usuario
	 * @return una lista con los vueloss
	 */
	@GET
	@Path("/{cedule}")
	public Response getAllUserFlights(@PathParam(value = "cedule") long cedule){
		return Response.status(200).entity(userService.getAllUserFlights(cedule)).header("Access-Control-Allow-Origin", "*").build();
	}
	
	/**
	 * une al usuario con el vuelo dado
	 * @param cedule, el usuario a crear
	 * @param flight, el vuelo
	 */
	@POST
	@Path("/{cedule}/join")
	public Response joinFlight(@PathParam(value = "cedule") long user,Flight flight) {
		System.out.println(flight +"-----------------");
		return Response.status(200).entity(userService.joinFlight(user,flight)).header("Access-Control-Allow-Origin", "*").build();
	}

}
