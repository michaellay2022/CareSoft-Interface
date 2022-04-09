package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;


public class Physician extends User implements HIPAACompliantUser{
//... imports class definition...
    

	// Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID =================================================
    public Physician(Integer id) {
    	super(id);
    	// TODO Auto-generated constructor stub
    }
    // TO DO: Implement HIPAACompliantUser!=================================================
	
    @Override
    public boolean assignPin(int pin) {
    	//Question 1 on Physician==========================================================
    	//pin must be 4 digits 
    	//expected to assign pin the user
//    	String pinString = Integer.toString(pin); //length is not work for int so first convert int to string first
//    	if (pinString.length()==4) {
//    		this.setPin(pin);
//    		return true;}
//    		
//    	else{
//    			return false;
//    		}
    	//Another way to write it
    	if (pin >999 && pin < 10000) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    	
    	// TODO Auto-generated method stub
//    	return false;
    }
    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	//Question 2 on Physician===================================
    	//Checks the physician's id against the given id;
//    	returns true if they are a match, otherwise false.
    	if (this.id==confirmedAuthID) {
    		return true;
    	}
    	
    	// TODO Auto-generated method stub
    	return false;
    }
    
    //==============================================================================
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	
    // TO DO: Setters & Getters
    
    public ArrayList<String> getPatientNotes() {
    	return patientNotes;
    }
    
    public void setPatientNotes(ArrayList<String> patientNotes) {
    	this.patientNotes = patientNotes;
    }


}
