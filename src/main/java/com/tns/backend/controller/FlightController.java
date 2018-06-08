package com.tns.backend.controller;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.tns.backend.service.FlightService;
import com.tns.backend.service.FlightServiceImpStub;

@Path("/vuelos")
public class FlightController {

	@Inject
	private FlightService flightService; //= new FlightServiceImpStub(); //deberia ser por inyección de dependencias

	@GET
	@Path("/ja")
	public Response obtenerVuelos() {

		return Response.status(200).entity(flightService.getAllFlights()).build();
	}

}
