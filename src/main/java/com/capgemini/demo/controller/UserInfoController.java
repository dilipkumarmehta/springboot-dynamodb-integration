package com.capgemini.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demo.UserInfo;
import com.capgemini.demo.page.SearchInput;
import com.capgemini.demo.service.UserInfoService;

/**
 * @author dimehta
 *
 */
@RestController
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping(value = "/registerUser/userInfo", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public String registerUser(@RequestBody UserInfo userInforeg) {
		return userInfoService.registerUser(userInforeg);

	}

	@RequestMapping(value = "/getuser/userId/{id}", method = RequestMethod.GET, produces = "application/json")
	public UserInfo getUserInfo(@PathVariable(value = "id") String id) {

		return userInfoService.getUserInfo(id);

	}

	@RequestMapping(value = "/updateUser/userInfo", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public String UpdateUserInfo(@RequestBody UserInfo userInfo) {
		return userInfoService.UpdateUserInfo(userInfo);

	}

	@RequestMapping(value = "/deleteUser/userId/{id}", method = RequestMethod.DELETE, produces = "application/json", consumes = "application/json")
	public String deleteUserInfo(@PathVariable(value = "id") String id) {
		return userInfoService.deleteUserInfo(id);

	}
	//http://localhost:8080/listPageable?page=0&size=3&sort=name
	@RequestMapping(value = "/users/getall", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public  List<UserInfo> getAllUserInfo(@RequestBody SearchInput searchInput) {
		System.out.println("hello" + searchInput);
		System.out.println(searchInput.getId() +searchInput.getPagiNamtion().getLimit() +searchInput.getPagiNamtion().getOffset());
		
		return userInfoService.getAllUserInfo(searchInput.getId(), searchInput.getPagiNamtion());

	}
}
