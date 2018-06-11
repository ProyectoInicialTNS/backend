package com.tns.backend.controller;


import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.tns.backend.service.FlightService;

@Path("/vuelos")
public class FlightController {

	@Inject
    @Named("flightServiceImpStub")
	private FlightService flightService;

	@GET
	@Path("/")
	public Response obtenerVuelos() {

		return Response.status(200).entity(flightService.getAllFlights()).header("Access-Control-Allow-Origin", "*").build();
	}

}
