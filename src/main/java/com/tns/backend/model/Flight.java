package com.tns.backend.model;

import java.util.Date;

public class Flight {

    //midle cost
    //private final static Long MORNING_COST=new Long("2");
    //lower cost
    //private final static Long AFTERNOON_COST=new Long("1");
    //maximum cost
    //private final static Long WEEKENDS_COST=new Long("3");

    private Date flightDay;
    private long cost;
    private int id;
    private String airline;
    private String flightImageUrl;
    private String origin;
    private String destiny;

    public Flight(Date flightDay, Long cost, int id, String airline, String flightImageUrl, String origin, String destiny) {
        this.flightDay = flightDay;
        this.cost = cost;
        this.id = id;
        this.airline = airline;
        this.flightImageUrl = flightImageUrl;
        this.origin = origin;
        this.destiny = destiny;
    }

    public Date getFlightDay() {
        return flightDay;
    }

    public void setFlightDay(Date flightDay) {
        this.flightDay = flightDay;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFlightImageUrl() {
        return flightImageUrl;
    }

    public void setFlightImageUrl(String flightImageUrl) {
        this.flightImageUrl = flightImageUrl;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }
}
