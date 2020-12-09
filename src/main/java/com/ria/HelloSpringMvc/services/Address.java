package com.ria.HelloSpringMvc.services;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private int pincode;
	private String city;
	public Address() {
		super();
	}
	public Address(int pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + "]";
	}
	
	

}
