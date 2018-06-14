package com.tms.backend.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.tns.backend.model.Flight;
import com.tns.backend.service.UserService;
import com.tns.backend.service.UserServiceImpHibernate;

public class UserServiceHibernateTest {
	
	@Test
	public void deberiaObtenerLosUsuariosCorrectamente() {
		List<Flight> arregloVuelos = new ArrayList<>();
		List<Flight> arregloVuelos2 = new ArrayList<>();
		arregloVuelos2.add(new Flight(new Date(new Long("1525596200000")),new Long("100000"),1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogoa", "Cartagena"));
		UserService test = Mockito.mock(UserServiceImpHibernate.class);
		Mockito.when(test.getAllUserFlights(0)).thenReturn(arregloVuelos);
		Mockito.when(test.getAllUserFlights(6)).thenReturn(arregloVuelos2);
		Assert.assertEquals(arregloVuelos2, test.getAllUserFlights(6));
		Assert.assertTrue(!(test.getAllUserFlights(6).equals(arregloVuelos)));
	}
	
	@Test
	public void deberiaAgregarCorrectamente() {
		try {
			UserService test = Mockito.mock(UserServiceImpHibernate.class);
			Flight avianca = new Flight(new Date(new Long("1525596200000")),new Long("100000"),1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
	                "Bogoa", "Cartagena");
			test.joinFlight(0, avianca);
			Assert.assertTrue(true);
		}catch(Exception e) {
			Assert.fail();
		}
	}

}
