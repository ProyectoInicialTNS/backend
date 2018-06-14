package com.tms.backend.flight;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.tns.backend.model.Flight;
import com.tns.backend.persistence.PersistenceFlightDao;
import com.tns.backend.persistence.PersistenceFlightDaoHibernateImp;

public class PersistenceFlightDaoHibernateTest {
	
	@Test
	public void deberiaConsultarCorrectamente() {
		PersistenceFlightDao pf = Mockito.mock(PersistenceFlightDaoHibernateImp.class);
    	List<Flight> arregloVuelos = new ArrayList<>();
		arregloVuelos.add(new Flight(new Date(new Long("1525596200000")),new Long("100000"),1,"Avianca","http://neuromarketinglatinoamerica.com/wp-content/uploads/2015/06/avion_avianca.png",
                "Bogoa", "Cartagena"));
    	Mockito.when(pf.getAllFlights()).thenReturn(arregloVuelos);
        Assert.assertEquals(arregloVuelos,pf.getAllFlights());
	}
	
	@Test
	public void deberiaPoblarCorrectamente() {
		PersistenceFlightDao pf = Mockito.mock(PersistenceFlightDaoHibernateImp.class);
		try {
			pf.populateDB();
			Assert.assertTrue(true);
		}catch(Exception e) {
			Assert.fail();
		}
	}

}
