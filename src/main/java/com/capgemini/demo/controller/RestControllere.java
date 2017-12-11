package com.capgemini.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.capgemini.demo.Register;
import com.capgemini.demo.service.RegisterationService;

@RestController
public class RestControllere {

	@Autowired
	private RegisterationService regiterationService;
	
	
	@RequestMapping(value = "/getuser/getid/{id}", method = RequestMethod.GET, produces = "application/json")
	public Register getLoginIfo(@PathVariable(value = "id") String id) {

		//return regiterationService.getLoginIfo(id);
		//String registr=regiterationService.registerUser(id);
		return null;

	}

	@RequestMapping(value = "/register/user", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public String registerUser(@RequestBody Register register) {
		return regiterationService.registerUser(register);

	}

}
