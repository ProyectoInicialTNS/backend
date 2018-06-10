package com.tns.backend.service;

import com.tns.backend.model.Flight;

import java.util.List;


public interface FlightService {

    /**
     * return all the flights
     * @return, a list of the flights
     */
    List<Flight> getAllFlights();
}
