package com.hotel.service;

 
import java.util.List;

import com.hotel.entity.Registration;

public interface RegistrationService {
	Registration saveAccount(Registration registration);

	List<Registration> searchByKeyWord(String startPeriod, String endPeriod, String city, String priceRange);

	List<Registration> checkRoomsPeriod(String startPeriod, String endPeriod);

	List<Registration> checkHotelRoom(String hotelRoom);

	List<Registration> cancelRoomReservation(String hotelRoom);

}
