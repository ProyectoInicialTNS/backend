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
    	String avianca = "Avianca";
    	String imagen = "http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png";
        flights.add(new Flight(new Date(new Long("152596200000")),100000L,1,avianca,imagen,
                "Bogota", "Cartagena"));
        flights.add(new Flight(new Date(new Long("152559200000")),120000L,2,avianca,imagen,
                "Chia", "Medellin"));
        flights.add(new Flight(new Date(new Long("152559620000")),130000L,3,avianca,imagen,
                "Cali", "Soacha"));
        flights.add(new Flight(new Date(new Long("152559720000")),140000L,4,avianca,imagen,
                "Chia", "Medellin"));
        flights.add(new Flight(new Date(new Long("1525596300000")),150000L,5,avianca,imagen,
                "Bucaramanga", "Barranquilla"));
        flights.add(new Flight(new Date(new Long("1525592200000")),160000L,6,avianca,imagen,
                "Santa marta", "Pereira"));
    }

    @Override
    public List<Flight> getAllFlights() {
        return flights;
    }
}
