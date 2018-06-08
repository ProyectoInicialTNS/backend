package com.tns.backend.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import com.tns.backend.model.Flight;

public class FlightServiceImpStub implements FlightService{

    private List<Flight> flights = new ArrayList<>();

    public FlightServiceImpStub(){
    	populateSampleData();
    }
    private void populateSampleData()  {
        flights.add(new Flight(new Date(new Long("1525596200000")),100000L,1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogotá", "Cartagena"));
        flights.add(new Flight(new Date(new Long("1525596200000")),100000L,2,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Chia", "Medellin"));
    }

    @Override
    public List<Flight> getAllFlights() {
        return flights;
    }
}
