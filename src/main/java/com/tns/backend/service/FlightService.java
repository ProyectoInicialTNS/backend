package com.tns.backend.service;

import com.tns.backend.model.Flight;

import java.util.List;


public interface FlightService {

    /**
     * retorna todos los vuelos que hay
     * @return, una lista con todos los vuelos
     */
    List<Flight> getAllFlights();
}
