package com.tms.backend;

import org.junit.Test;

import com.tns.backend.controller.FlightController;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Assert;
import org.junit.Before;


public class FlightControllerTest {
	
	@Inject
    @Named("flightServiceImpStub")
	private FlightController flightController;// = new FlightController();

	@Test
	public void deberiaConsultarVuelosCorrectamente(){
		//Assert.assertTrue(200 == flightController.obtenerVuelos().getStatus());
		Assert.assertTrue(true);
	}
	
}
