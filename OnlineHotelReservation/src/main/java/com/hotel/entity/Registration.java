/**
 * 
 */
/**
 * @author TihinkPad
 *
 */
package com.hotel.entity;

 



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "hotel_registration")
public class Registration implements Serializable  {

    private static final long serialVersionUID = -1984554807132781312L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hotelId;
	
	private String roomNo;
	private String hotelRoomFloor;
	private String hotelUserName;
	private String hotelUserCardId;
	private String hotelUserPhone;
	private String hotelUserStatus;
	private String hotelUserCountry;
	private String hotelUserCity;
	private String hotelUserPrice;
	private Date  hotelStartDate;
	private Date hotelEndDate;
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getHotelRoomFloor() {
		return hotelRoomFloor;
	}
	public void setHotelRoomFloor(String hotelRoomFloor) {
		this.hotelRoomFloor = hotelRoomFloor;
	}
	public String getHotelUserName() {
		return hotelUserName;
	}
	public void setHotelUserName(String hotelUserName) {
		this.hotelUserName = hotelUserName;
	}
	public String getHotelUserCardId() {
		return hotelUserCardId;
	}
	public void setHotelUserCardId(String hotelUserCardId) {
		this.hotelUserCardId = hotelUserCardId;
	}
	public String getHotelUserPhone() {
		return hotelUserPhone;
	}
	public void setHotelUserPhone(String hotelUserPhone) {
		this.hotelUserPhone = hotelUserPhone;
	}
	public String getHotelUserStatus() {
		return hotelUserStatus;
	}
	public void setHotelUserStatus(String hotelUserStatus) {
		this.hotelUserStatus = hotelUserStatus;
	}
	public String getHotelUserCountry() {
		return hotelUserCountry;
	}
	public void setHotelUserCountry(String hotelUserCountry) {
		this.hotelUserCountry = hotelUserCountry;
	}
	public String getHotelUserCity() {
		return hotelUserCity;
	}
	public void setHotelUserCity(String hotelUserCity) {
		this.hotelUserCity = hotelUserCity;
	}
	public String getHotelUserPrice() {
		return hotelUserPrice;
	}
	public void setHotelUserPrice(String hotelUserPrice) {
		this.hotelUserPrice = hotelUserPrice;
	}
	public Date getHotelStartDate() {
		return hotelStartDate;
	}
	public void setHotelStartDate(Date hotelStartDate) {
		this.hotelStartDate = hotelStartDate;
	}
	public Date getHotelEndDate() {
		return hotelEndDate;
	}
	public void setHotelEndDate(Date hotelEndDate) {
		this.hotelEndDate = hotelEndDate;
	}
 
 
	
}