package com.tms.backend;

import com.tns.backend.model.Flight;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class FlightModelTest {
    @Test
    public void deberiaObtenerIdCorrectamente(){
        Flight avianca = new Flight(new Date(new Long("1525596200000")),new Long("100000"),1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogotá", "Cartagena");
        Assert.assertEquals(avianca.getId(),1);
    }

    @Test
    public void deberiaObtenerFechaCorrectamente(){
        Flight avianca = new Flight(new Date(new Long("1525596200000")),new Long("100000"),1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogotá", "Cartagena");
        Assert.assertEquals(avianca.getFlightDay(),new Date(new Long("1525596200000")));
    }

    @Test
    public void deberiaObtenerPrecioCorrectamente(){
        Flight avianca = new Flight(new Date(new Long("1525596200000")),100000L,1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogotá", "Cartagena");
        Assert.assertEquals(avianca.getCost(),100000L);
    }

    @Test
    public void deberiaObtenerAerolineaCorrectamente(){
        Flight avianca = new Flight(new Date(new Long("1525596200000")),100000L,1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogotá", "Cartagena");
        Assert.assertEquals(avianca.getAirline(),"Avianca");
    }

    @Test
    public void deberiaObtenerURLImageCorrectamente(){
        Flight avianca = new Flight(new Date(new Long("1525596200000")),100000L,1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogotá", "Cartagena");
        Assert.assertEquals(avianca.getFlightImageUrl(),"http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png");
    }

    @Test
    public void deberiaObterVueloOrigenCorrectamente(){
        Flight avianca = new Flight(new Date(new Long("1525596200000")),100000L,1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogotá", "Cartagena");
        Assert.assertEquals(avianca.getOrigin(),"Bogotá");
    }

    @Test
    public void deberiaObterVueloDestinoCorrectamente(){
        Flight avianca = new Flight(new Date(new Long("1525596200000")),100000L,1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogotá", "Cartagena");
        Assert.assertEquals(avianca.getDestiny(),"Cartagena");
    }

}
