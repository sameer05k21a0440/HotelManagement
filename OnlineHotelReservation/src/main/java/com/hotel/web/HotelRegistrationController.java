package com.hotel.web;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hotel.entity.Registration;
import com.hotel.service.RegistrationService;

@RestController
@RequestMapping("/hotel")
public class HotelRegistrationController {

	@Autowired
	private RegistrationService registrationService;
	@PostMapping(value ="/saveRegistration")  //Registration
	public Registration saveRegistration(String roomNo,String hotelRoomFloor,
			String hotelUserName,String hotelUserCardId,
			String hotelUserPhone,String hotelUserStatus,
			String hotelUserCountry,String hotelUserCity,
			String hotelUserPrice,
			Date hotelStartDate,
			Date hotelEndDate
			) throws ParseException {
		System.out.println("POST METHOD!!!!!");
		Registration registration=new Registration();
		registration.setRoomNo(roomNo);
		registration.setHotelRoomFloor(hotelRoomFloor);
		registration.setHotelUserName(hotelUserName);
		registration.setHotelUserCardId(hotelUserCardId);
		registration.setHotelUserPhone(hotelUserPhone);
		registration.setHotelUserCountry(hotelUserCountry);
		registration.setHotelUserCity(hotelUserCity);
		registration.setHotelUserPrice(hotelUserPrice);
		registration.setHotelStartDate(hotelStartDate);
		registration.setHotelEndDate(hotelEndDate);
		return registrationService.saveAccount(registration);
	}
	
	
	   @RequestMapping("/searchHotelRooms") //Search Rooms
	    public List<Registration> searchHotelRooms(String startPeriod,String endPeriod,String city,String priceRange) {
		   List <Registration> searchList = registrationService.searchByKeyWord(startPeriod,endPeriod,city,priceRange);
	        return searchList;
	    }
	   
	   @RequestMapping("/checkHotelRoomsPeriod")  //Check Hotel Room Period 
	   public List<Registration> checkHotelRoomsPeriod(String startPeriod,String endPeriod){
		   List<Registration> listRoomsPeriod =registrationService.checkRoomsPeriod(startPeriod,endPeriod);
		   Registration registration =new Registration();
		   if(listRoomsPeriod.size()>0) {
			   //If Rooms Avaliable Particular period request to add
			   registration.setHotelUserStatus("Not Available");
		   }else {
			   registration.setHotelUserStatus(" Available");
		   }
		   return listRoomsPeriod;
	   }
	   @RequestMapping("/checkRoomReservation")      //List Hotel Room List
	   public List<Registration> checkHotelRooms(String hotelRoom){
		   List <Registration> searchList = registrationService.checkHotelRoom(hotelRoom);
	        return searchList;
	   }
	   @RequestMapping("/cancelRoomReservation")
	   public List<Registration> cancelRoomReservation(String hotelRoom){
		   List<Registration> list = new ArrayList<Registration>();
		   List <Registration> searchList = registrationService.cancelRoomReservation(hotelRoom);
		   Registration registration =new Registration();
		   if(searchList.size()>0) {
			   //Available Room 
			 for(Registration  userReg :searchList) {
				 String userStatus =userReg.getHotelUserStatus();
				 if(userStatus.equals("active")) {    //Check to Cancel or Inactive
					 registration.setHotelUserStatus("Inactive"); 
					 list.add(registration);
				 }
			 }
		   }
	        return list;
	   }
    
}
