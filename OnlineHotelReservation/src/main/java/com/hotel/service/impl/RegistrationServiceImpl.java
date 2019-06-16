package com.hotel.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fuyoubank.entity.News;
import com.hotel.entity.Registration;
import com.hotel.repository.RegistrationRepository;
import com.hotel.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	@PersistenceContext
    private EntityManager em;
	 
	@Autowired
	EntityManagerFactory emf;
	
	@Autowired
	private RegistrationRepository  registrationRepository;

	@Override
	public Registration saveAccount(Registration registration) {
		return registrationRepository.saveAndFlush(registration);
	}

	@Override
	public List<Registration> searchByKeyWord(String startPeriod, String endPeriod, String city, String priceRange) {
	 EntityManager entityManager = emf.createEntityManager();
	 try {
		 String sqlSearch ="SELECT * FROM Registration where  hotelStartDate LIKE +'%'+'"+startPeriod+"'+'%' "
		            + "OR  hotelEndDate LIKE +'%'+' "+endPeriod+" '+'%'"
					+ "OR  city LIKE +'%'+'"+city+"'+'%'"
					+ "OR  city LIKE +'%'+'"+priceRange+"'+'%'";
	entityManager.getTransaction().begin();
	javax.persistence.Query query = entityManager.createNativeQuery(sqlSearch);
	List<Registration> list = query.getResultList();
	if(list.size()>0) {
		return list;
	}else {
		return null;
	}
	 }catch(Exception ex) {
		 ex.printStackTrace();
	 }
	return null;
	}

	@Override
	public List<Registration> checkRoomsPeriod(String startPeriod, String endPeriod) {
		 EntityManager entityManager = emf.createEntityManager();
		try {
			String hql = "SELECT * from Registration where hotelStartDate= '"+startPeriod+"' AND hotelEndDate= '"+endPeriod+"'";
			 entityManager.getTransaction().begin();
			 javax.persistence.Query query = entityManager.createNativeQuery(hql);
				List<Registration> list = query.getResultList();
				if(list.size()>0) {
					return list;
				}else {
					return null;
				}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Registration> checkHotelRoom(String hotelRoom) {
		 EntityManager entityManager = emf.createEntityManager();
		 try {
			String hql = "SELECT * from Registration where roomNo='"+hotelRoom+"";
			 entityManager.getTransaction().begin();
			 javax.persistence.Query query = entityManager.createNativeQuery(hql);
				List<Registration> list = query.getResultList();
				if(list.size()>0) {
					return list;
				}else {
					return null;
				}
		 }catch(Exception ex) {
			 ex.printStackTrace();
		 }
		return null;
	}

	@Override
	public List<Registration> cancelRoomReservation(String hotelRoom) {
	   EntityManager entityManager = emf.createEntityManager();
	   try {
		   String hql = "SELECT * from Registration where roomNo='"+hotelRoom+"";
			 entityManager.getTransaction().begin();
			 javax.persistence.Query query = entityManager.createNativeQuery(hql);
				List<Registration> list = query.getResultList();
				if(list.size()>0) {
					return list;
				}else {
					return null;
				}
	   }catch(Exception ex) {
		   ex.printStackTrace();
	   }
		return null;
	}	 
}
