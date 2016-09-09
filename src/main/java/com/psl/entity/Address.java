package com.psl.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="addr")
public class Address {
	
	@Value(value="Nagpur")
	private String city;
	
	@Value(value="MG Rd")
	private String street;
	
	
	@Value(value="4723492")
	private String zip;
	
	public Address() {
		System.out.println("In default constructor of Address");
	}
	
	public Address(String city, String street, String zip) {
		System.out.println("In param constructor of Address");
		this.city = city;
		this.street = street;
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("In setCity");
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		System.out.println("In setStreet");
		this.street = street;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		System.out.println("In setZip");
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", zip=" + zip
				+ "]";
	}
	
	

}
