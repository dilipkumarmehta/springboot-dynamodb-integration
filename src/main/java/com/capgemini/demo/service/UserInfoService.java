package com.capgemini.demo.service;

import java.util.List;

import com.capgemini.demo.UserInfo;
import com.capgemini.demo.page.PagiNamtion;

/**
 * @author dimehta
 *
 */
public interface UserInfoService {


	public String registerUser(UserInfo userInfoReg);

	public UserInfo getUserInfo(String id);
	
	public String UpdateUserInfo(UserInfo userInfo);
	
	public String deleteUserInfo(String userId);
	
	public List<UserInfo>  getAllUserInfo(String id,PagiNamtion pagiNamtion );
	
}
