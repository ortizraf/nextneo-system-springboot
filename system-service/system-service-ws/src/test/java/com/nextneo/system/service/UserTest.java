package com.nextneo.system.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.nextneo.system.framework.models.entity.User;
import com.nextneo.system.framework.utils.exception.BusinessException;
import com.nextneo.system.service.service.UserService;

public class UserTest extends SystemApplicationTests {
		
	@Autowired
	private UserService userService;
	
	@Test
	public void saveUser() throws BusinessException, Exception {
		
		User user = new User();
		user.setLogin("user");
		
		user = userService.addUser(user);
				
		assertEquals("user", user.getLogin());

	}
	
	@Test
	public void findUser() throws BusinessException, Exception {
		
		User user = userService.findByLogin("user");
				
		assertEquals("user", user.getLogin());

	}
	
	@Test
	public void removeUser() throws BusinessException, Exception {
		
		User user = userService.findByLogin("user");
		if (user != null) {
			userService.removeUser(user);
		}

	}

}
