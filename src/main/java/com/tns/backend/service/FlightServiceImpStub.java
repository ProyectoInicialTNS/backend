package com.tns.backend.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.inject.Named;

import com.tns.backend.model.Flight;


@Named("flightServiceImpStub")
public class FlightServiceImpStub implements FlightService{

    private List<Flight> flights = new ArrayList<>();

    public FlightServiceImpStub(){
    	populateSampleData();
    }
    private void populateSampleData()  {
        flights.add(new Flight(new Date(new Long("1525596200000")),100000L,1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogota", "Cartagena"));
        flights.add(new Flight(new Date(new Long("1525596200000")),100000L,2,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Chia", "Medellin"));
        flights.add(new Flight(new Date(new Long("1525596200000")),100000L,3,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogota", "Cartagena"));
        flights.add(new Flight(new Date(new Long("1525596200000")),100000L,4,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Chia", "Medellin"));
        flights.add(new Flight(new Date(new Long("1525596200000")),100000L,5,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogota", "Cartagena"));
        flights.add(new Flight(new Date(new Long("1525596200000")),100000L,6,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Chia", "Medellin"));
    }

    @Override
    public List<Flight> getAllFlights() {
        return flights;
    }
}
