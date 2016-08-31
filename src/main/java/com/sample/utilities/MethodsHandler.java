/**
 * 
 */
package com.sample.utilities;


import com.sample.activities.ClickMethods;
import com.sample.activities.CompareMethods;
import com.sample.activities.InputMethod;
import com.sample.activities.DatePicker;


/**
 * @author arafatmamun
 *
 */
public abstract class MethodsHandler {
	
	private final static String xpath = "xpath";
	private final static String id = "id";
	private final static String cssSelector = "css";
	private final static String name = "name";
	private final static String linkText = "linkText";
	
	public static String getXpath() {
		return xpath;
	}

	public static String getId() {
		return id;
	}

	public static String getCssselector() {
		return cssSelector;
	}

	public static String getName() {
		return name;
	}
	
	public static String getLinkText(){
		return linkText;
	}
	
	
	/*
	 * Object for Click Methods
	 */
	public ClickMethods click(){
		ClickMethods clickMethods = new ClickMethods();
		return clickMethods;
	}
	
	/*
	 * Object for Assert Methods
	 */
	public CompareMethods compare(){
		CompareMethods compareMethods = new CompareMethods();
		return compareMethods;
	}
	
	public InputMethod inputMethod(){
		InputMethod inputMethod = new InputMethod();
		return inputMethod;
	}
	
	/*
	 * 
	 * This method return Date Picker Object.
	 * Ataul
	 * 8-17-2016 24:26
	 */
	
	public DatePicker datePickerMethods(){		
		DatePicker picker = new DatePicker();
		return picker;		
	}
	
	
	
}
