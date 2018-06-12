package com.tns.backend.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name="FLIGHTS")
public class Flight {

    //midle cost
	public static final Long MORNING_COST=new Long("2");
    //maximum cost
    public static final  Long WEEKENDS_COST=new Long("3");

    private Date flightDay;
    private long baseCost;
    private long finalCost;
    private int id;
    private String airline;
    private String flightImageUrl;
    private String origin;
    private String destiny;
    
    @JsonIgnore
    private List<User> usersList;

    
    
    public Flight() {
    	super();
	}

	public Flight(Date flightDay, Long cost, int id, String airline, String flightImageUrl, String origin, String destiny) {
        this.flightDay = flightDay;
        Calendar cal = Calendar.getInstance();
        cal.setTime(flightDay);
        this.baseCost = cost;
        this.finalCost = cost;
        if(cal.get(Calendar.HOUR_OF_DAY)<=12)this.finalCost = baseCost * MORNING_COST;
        if(cal.get(Calendar.DAY_OF_WEEK)<=7 && cal.get(Calendar.DAY_OF_WEEK)>5)this.finalCost = baseCost * WEEKENDS_COST;
        this.id = id;
        this.airline = airline;
        this.flightImageUrl = flightImageUrl;
        this.origin = origin;
        this.destiny = destiny;
        this.usersList = new ArrayList<>();
    }

    @Column(name="flightDay")
    public Date getFlightDay() {
        return flightDay;
    }

    public void setFlightDay(Date flightDay) {
        this.flightDay = flightDay;
    }

    @Column(name="baseCost")
    public long getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(long cost) {
        this.baseCost = cost;
    }
    
    @GeneratedValue
    @Id
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="airline")
    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Column(name="flightImageUrl")
    public String getFlightImageUrl() {
        return flightImageUrl;
    }

    public void setFlightImageUrl(String flightImageUrl) {
        this.flightImageUrl = flightImageUrl;
    }

    @Column(name="origin")
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Column(name="destiny")
    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }
    
    @Column(name="finalCost")
    public long getFinalCost(){
    	return this.finalCost;
    }
    
    public void setFinalCost(long finalCost){
    	this.finalCost = finalCost;
    }

    @ManyToMany(mappedBy = "flightsList", fetch = FetchType.EAGER)
	public List<User> getUsersList() {
		return usersList;
	}
    
	public void setUsersList(List<User> usersList) {
		this.usersList = usersList;
	}

	@Override
	public String toString() {
		return "Flight [flightDay=" + flightDay + ", baseCost=" + baseCost + ", finalCost=" + finalCost + ", id=" + id
				+ ", airline=" + airline + ", flightImageUrl=" + flightImageUrl + ", origin=" + origin + ", destiny="
				+ destiny + "]";
	}
    
	
    
    
    
}
