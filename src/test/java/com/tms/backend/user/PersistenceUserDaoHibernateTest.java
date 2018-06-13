package com.tms.backend.user;

import org.junit.Test;

import com.tns.backend.persistence.PersistenceUserDao;
import com.tns.backend.persistence.PersistenceUserDaoHibernateImp;

public class PersistenceUserDaoHibernateTest {
	
	@Test
	public void deberiaConsultarCorrectamente() {
		PersistenceUserDao pud = new PersistenceUserDaoHibernateImp();
		pud.joinFlight(cedule, flight);
		pud.getAllUserFlights(0);
	}
	

}
