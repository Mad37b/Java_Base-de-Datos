package com.iesVda.oracleDBA;
import java.util.*;

/**
 * 
 */
public class Locations extends Departments {

    /**
     * Default constructor
     */
    public Locations() {
    }

    /**
     * 
     */
    public String location_id;

    /**
     * 
     */
    public String street_address;

    /**
     * 
     */
    public int postal_code;

    /**
     * 
     */
    public String city;

    /**
     * 
     */
    public String state_province;

    /**
     * 
     */
    public String country_id;

	public String getLocation_id() {
		return location_id;
	}

	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}

	public String getStreet_address() {
		return street_address;
	}

	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}

	public int getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState_province() {
		return state_province;
	}

	public void setState_province(String state_province) {
		this.state_province = state_province;
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
    
    

}