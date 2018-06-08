package com.tns.backend.service;

import com.tns.backend.model.Flight;

import java.util.List;


public interface FlightService {

    /**
     * return all the airlines
     * @return, a list of the airlines
     */
    List<Flight> getAllFlights();
}
