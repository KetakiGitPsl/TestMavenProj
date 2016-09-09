package com.psl.entity;

public class Address2 {
	
	private String city;
	private String street;
	private String zip;
	
	private String landmark;
	
	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public Address2() {
		System.out.println("In default constructor of Address");
	}
	
	public Address2(String city, String street, String zip) {
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
