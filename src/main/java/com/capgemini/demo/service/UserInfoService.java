package com.capgemini.demo.service;

import com.capgemini.demo.UserInfo;

public interface UserInfoService {


	public String registerUser(UserInfo userInfoReg);

	public UserInfo getUserInfo(String id);
	
	public String UpdateUserInfo(UserInfo userInfo);
	
	public String deleteUserInfo(String userId);
	
}
