package com.tms.backend;

import com.tns.backend.service.FlightService;
import com.tns.backend.service.FlightServiceImpStub;

import org.junit.Assert;
import org.junit.Test;

public class FlightServiceImpStubTest {

	private FlightService flightService = new FlightServiceImpStub();
    
    
    @Test
    public void deberiaConsultarLosVuelosCorrectamente(){
        Assert.assertEquals(2,flightService.getAllFlights().size());
    }
}
