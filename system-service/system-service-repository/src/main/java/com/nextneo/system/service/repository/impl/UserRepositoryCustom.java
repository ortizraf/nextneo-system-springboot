package com.nextneo.system.service.repository.impl;

import java.util.List;
import java.util.Set;

import com.nextneo.system.framework.models.entity.User;

/**
* @author  Rafael M Ortiz
*/

public interface UserRepositoryCustom {
	
	public User addUser(User usuario);

	public User updateUser(User usuario);
	
	public void removeUser(User usuario);

	public User findById(long id);

	public List<User> findById(Set<Long> ids);

	public User findByLogin(String login);
	
}
