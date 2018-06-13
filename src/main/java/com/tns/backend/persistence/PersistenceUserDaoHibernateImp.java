package com.tns.backend.persistence;

import java.util.Calendar;
import java.util.List;

import javax.inject.Named;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tns.backend.model.Flight;
import com.tns.backend.model.User;

@Named("persistenceUserDaoHibernateImp")
public class PersistenceUserDaoHibernateImp implements PersistenceUserDao {

	@Override
	public List<Flight> getAllUserFlights(long cedule) {
		SessionFactory sessionFactory = SessionFactoryTNS.getSessionFactory();
		Session s=sessionFactory.openSession();
		List<Flight> res = s.load(User.class, cedule).getflightsList();
		s.close();
		return res;
	}

	@Override
	public boolean joinFlight(long cedule, Flight flight) {
		boolean ans = true;
		SessionFactory sessionFactory = SessionFactoryTNS.getSessionFactory();
		Session s=sessionFactory.openSession();
		Transaction tx=s.beginTransaction(); //inicio de la transaccion
		User user = s.get(User.class, cedule);
		if (user == null) user = new User(cedule);
		ans = checkDate(user,flight);
		if(ans){//si puede agregar el vuelo
			user.getflightsList().add(flight);
			s.saveOrUpdate(user);
		}
		tx.commit(); //fin de la transaccion
		s.close();
		return ans;
	}

	/**
	 * valida  el vuelo dado es el mismo dia que algunos de los vuelos que tiene el usuario
	 * @param user, el usuario
	 * @param flight, el vuelo
	 * @return true si no coinciden las fechas para el mismo dia, false de lo contrario
	 */
	private boolean checkDate(User user, Flight flight) {
		Calendar cal = Calendar.getInstance();
		boolean ans = true;
		cal.setTime(flight.getFlightDay());
        int yearPrevious = cal.get(Calendar.YEAR);
        int monthPrevious = cal.get(Calendar.MONTH);
        int dayPrevious = cal.get(Calendar.DAY_OF_MONTH);
		for (int i = 0; i < user.getflightsList().size() && ans; i++) {
			cal.setTime(user.getflightsList().get(i).getFlightDay());
            int yearNow = cal.get(Calendar.YEAR);
            int monthNow = cal.get(Calendar.MONTH);
            int dayNow = cal.get(Calendar.DAY_OF_MONTH);
			ans = !(yearPrevious == yearNow && monthPrevious==monthNow && dayPrevious == dayNow);
		}
		return ans;
	}

}
