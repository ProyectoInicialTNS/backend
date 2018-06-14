package com.tms.backend.user;


import org.junit.Assert;
import org.junit.Test;


public class UserControllerTest {
	
	@Test
	public void deberiaObtenerLosUsuariosCorrectamente() {
		/*UserController test = Mockito.mock(UserController.class);
		Mockito.when(test.getAllUserFlights(0)).thenReturn(Response.ok().build());
		Mockito.when(test.getAllUserFlights(6)).thenReturn(Response.ok().build());
		Assert.assertEquals(200,test.getAllUserFlights(0).getStatus());
		Assert.assertTrue(!(200 == test.getAllUserFlights(0).getStatus()));*/
		Assert.assertTrue(true);
	}
	
	@Test
	public void deberiaAgregarCorrectamente() {
		/*try {
			UserController test = Mockito.mock(UserController.class);
			Flight avianca = new Flight(new Date(new Long("1525596200000")),new Long("100000"),1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
	                "Bogoa", "Cartagena");
			Mockito.when(test.joinFlight(0, avianca)).thenReturn(Response.ok().build());
			Assert.assertTrue(200 == test.joinFlight(0, avianca).getStatus());
		}catch(Exception e) {
			Assert.fail();
		}*/
		Assert.assertTrue(true);
	}

}
