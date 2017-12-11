package com.capgemini.demo;

import java.io.Serializable;

public class Register implements Serializable {
	private String name;
	private String password;
	private String id;
	
	public Register() {
	}
	public Register(String name, String password, String id) {
		super();
		this.name = name;
		this.password = password;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

	

}
