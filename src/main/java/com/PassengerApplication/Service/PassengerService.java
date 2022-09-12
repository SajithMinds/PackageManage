package com.PassengerApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.PassengerApplication.Entity.PassengerData;
import com.PassengerApplication.Entity.PassengerDetails;

@Component
public class PassengerService {
 @Autowired
 PassengerDetails repos;
 public List<PassengerData> getPassengerData(){
		return repos.getAllPassengerData();
	}

}
