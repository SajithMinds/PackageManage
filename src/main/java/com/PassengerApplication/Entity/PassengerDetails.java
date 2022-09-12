package com.PassengerApplication.Entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class PassengerDetails {

   List<PassengerData> passenger = new ArrayList<>(Arrays.asList(new PassengerData(1701,"akhil",29,"kerala","Bangalore"),
		   new PassengerData(1702,"Ratan",25,"Chennai","Bangalore"),
		   new PassengerData(1703,"Raghav",24,"Hyderbad","Bangalore"),
		   new PassengerData(1704,"Rahul",30,"Delhi","Bangalore"),
		   new PassengerData(1705,"Zack",29,"Mumbai","Bangalore")));
   
   public List<PassengerData> getAllPassengerData() {
	   return passenger;
   }
		
}
