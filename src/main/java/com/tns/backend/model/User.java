package com.tns.backend.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import javax.persistence.JoinColumn;

/**
 * @author Carlos Sanchez
 *
 */
@Entity
@Table(name="USERS")
public class User {


	private Long cedule;
	
    private List<Flight> flightsList;
    
	public User() {
		super();
	}
	
	
	/**
	 * Crea un usuarrio con la cedula dada
	 * @param cedule, la cedula del nuevo usuario
	 */
	public User(Long cedule) {
		super();
		this.cedule = cedule;
		this.flightsList = new ArrayList<>();
	}



	@Id
    @Column(name="cedule")
    public Long getCedule() {
		return cedule;
	}
	public void setCedule(Long cedule) {
		this.cedule = cedule;
	}
	
	
	@ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinTable(name="FLIGHTS_USERS",
        joinColumns=
            @JoinColumn(name="USERS_cedule", referencedColumnName="cedule"),
        inverseJoinColumns=
            @JoinColumn(name="FLIGHTS_id", referencedColumnName="id")
        )
	public List<Flight> getflightsList() {
		return flightsList;
	}
	
	public void setflightsList(List<Flight> flightsList) {
		this.flightsList = flightsList;
	}


	@Override
	public String toString() {
		return "User [cedule=" + cedule + ", flightsList=" + flightsList + "]";
	}
	
	
    
    
    
    

}
