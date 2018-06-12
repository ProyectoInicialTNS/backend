package com.tms.backend.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.tns.backend.model.Flight;
import com.tns.backend.model.User;



public class UserModelTest {
	
	@Test
    public void deberiaCrearUsuarioCorrectamente(){
		User user = new User(1072714444L);
		Assert.assertTrue(user != null);
	}
	
	@Test
	public void deberiaAsignarCorrectamente() {
		User user = new User();
		user.setCedule(1072714444L);
		Assert.assertTrue(1072714444L == user.getCedule());
	}
	
	@Test
	public void deberiaAsignarVueloCorrectamente() {
		User user = new User(1072714444L);
		Flight vuelo = new Flight(new Date(new Long("1525596200000")),100000L,1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogotá", "Cartagena");
		List<Flight> vuelos = new ArrayList<>();
		vuelos.add(vuelo);
		user.setflightsList(vuelos);
		Assert.assertEquals(vuelo, user.getflightsList().get(0));
	}

}
