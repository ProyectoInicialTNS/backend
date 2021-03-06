package com.tms.backend.flight;

import com.tns.backend.model.Flight;
import com.tns.backend.service.FlightService;
import com.tns.backend.service.FlightServiceImpStub;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class FlightServiceImpStubTest {
    
    @Test
    public void deberiaConsultarLosVuelosCorrectamente(){
    	FlightService fs = Mockito.mock(FlightServiceImpStub.class);
    	List<Flight> arregloVuelos = new ArrayList<>();
		arregloVuelos.add(new Flight(new Date(new Long("1525596200000")),new Long("100000"),1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogoa", "Cartagena"));
    	Mockito.when(fs.getAllFlights()).thenReturn(arregloVuelos);
        Assert.assertEquals(arregloVuelos,fs.getAllFlights());
    }
}
