package com.capgemini.demo;

import java.io.Serializable;

/**
 * @author dimehta
 *
 */
public class UserInfo implements Serializable {
	
	private String userName;
	private String password;
	private String userId;
	private String primarySkill;
	private String secondarySkill;
	private String experience;
	private String education;
	private String location;

	public UserInfo() {
		super();
	}

	public UserInfo(String userName, String password, String userId, String primarySkill, String secondarySkill,
			String experience, String education, String location) {
		this.userName = userName;
		this.password = password;
		this.userId = userId;
		this.primarySkill = primarySkill;
		this.secondarySkill = secondarySkill;
		this.experience = experience;
		this.education = education;
		this.location = location;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	public String getSecondarySkill() {
		return secondarySkill;
	}

	public void setSecondarySkill(String secondarySkill) {
		this.secondarySkill = secondarySkill;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "UserInfo [userName=" + userName + ", password=" + password + ", userId=" + userId + ", primarySkill="
				+ primarySkill + ", secondarySkill=" + secondarySkill + ", experience=" + experience + ", education="
				+ education + ", location=" + location + "]";
	}

}
