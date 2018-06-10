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
        avianca.setId(5);
        Assert.assertEquals(avianca.getId(),5);
    }

    @Test
    public void deberiaObtenerFechaCorrectamente(){
        Flight avianca = new Flight(new Date(new Long("1525596200000")),new Long("100000"),1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogotá", "Cartagena");
        avianca.setFlightDay(new Date(new Long("123456")));
        Assert.assertEquals(avianca.getFlightDay(),new Date(new Long("123456")));
    }

    @Test
    public void deberiaObtenerPrecioCorrectamente(){
        Flight avianca = new Flight(new Date(new Long("1525596200000")),100000L,1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogotá", "Cartagena");
        avianca.setCost(55L);
        Assert.assertEquals(avianca.getCost(),55L);
    }

    @Test
    public void deberiaObtenerAerolineaCorrectamente(){
        Flight avianca = new Flight(new Date(new Long("1525596200000")),100000L,1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogotá", "Cartagena");
        Assert.assertEquals(avianca.getAirline(),"Avianca");
        avianca.setAirline("VivaColombia");
        Assert.assertEquals("VivaColombia", avianca.getAirline());
    }

    @Test
    public void deberiaObtenerURLImageCorrectamente(){
        Flight avianca = new Flight(new Date(new Long("1525596200000")),100000L,1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogotá", "Cartagena");
        Assert.assertEquals(avianca.getFlightImageUrl(),"http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png");
        avianca.setFlightImageUrl("http://Testing.jpg");
        Assert.assertEquals("http://Testing.jpg", avianca.getFlightImageUrl());
    }

    @Test
    public void deberiaObterVueloOrigenCorrectamente(){
        Flight avianca = new Flight(new Date(new Long("1525596200000")),100000L,1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogotá", "Cartagena");
        Assert.assertEquals(avianca.getOrigin(),"Bogotá");
        avianca.setOrigin("Chile");
        Assert.assertEquals("Chile",avianca.getOrigin());
    }

    @Test
    public void deberiaObterVueloDestinoCorrectamente(){
        Flight avianca = new Flight(new Date(new Long("1525596200000")),100000L,1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogotá", "Cartagena");
        Assert.assertEquals(avianca.getDestiny(),"Cartagena");
        avianca.setDestiny("Bogota");
        Assert.assertEquals("Bogota", avianca.getDestiny());
    }

}
