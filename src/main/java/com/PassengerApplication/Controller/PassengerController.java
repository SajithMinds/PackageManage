package com.PassengerApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PassengerApplication.Entity.PassengerData;
import com.PassengerApplication.Service.PassengerService;



@RestController
@RequestMapping("/api")
public class PassengerController {
	@Autowired
	PassengerService service;
	@GetMapping("/list")
	public List<PassengerData> findAllPassengerData(){
		return service.getPassengerData();
	}

}
