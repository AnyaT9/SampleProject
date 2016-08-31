/**
 * 
 */
package com.sample.utilities;

import com.sample.pageObjects.Flights;
import com.sample.pageObjects.Header;
import com.sample.pageObjects.Home;
import com.sample.pageObjects.Hotels;

/**
 * @author arafatmamun
 *
 */
public abstract class PageObjectsHandler {
	
	/*
	 * Object For Header
	 */
	public static Header header(){
		Header header = new Header();
		return header;
	}
	
	/*
	 * Object For Home Page
	 */
	public static Home home(){
		Home home = new Home();
		return home;
	}
	
	/*
	 * Object For Hotels Page
	 */
	public static Hotels hotels(){
		Hotels hotels = new Hotels();
		return hotels;
	}
	
	/*
	 * Object For Flights Page
	 */
	public static Flights flights(){
		Flights flights = new Flights();
		return flights;
	}
	
	
	
}
