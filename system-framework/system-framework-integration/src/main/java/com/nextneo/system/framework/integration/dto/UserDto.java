package com.nextneo.system.framework.integration.dto;

import java.io.Serializable;
import java.util.Calendar;

public class UserDto implements Serializable {
	
	private static final long serialVersionUID = -2210646835870220454L;

	private Long id;
	
	private String login;
	
	private String name;
	
	private String password;
	
	public UserDto() {
		super();
	}

	public UserDto(Long id, Calendar lastAccess, String login, String password) {
		this.id = id;
		this.login = login;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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

}
