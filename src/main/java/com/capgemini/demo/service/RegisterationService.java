package com.capgemini.demo.service;

import com.capgemini.demo.Register;

public interface RegisterationService {


	public String registerUser(Register register);

	public Register getLoginIfo(String id);
	
	//public String UpdateUser();
	
	//public void deleteUser(String userId);
	
}
