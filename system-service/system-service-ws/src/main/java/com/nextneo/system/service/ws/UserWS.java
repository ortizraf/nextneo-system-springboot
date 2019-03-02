package com.nextneo.system.service.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nextneo.system.framework.models.entity.User;
import com.nextneo.system.framework.utils.exception.BusinessException;
import com.nextneo.system.framework.utils.path.ResourcePath;
import com.nextneo.system.service.service.UserService;

/**
* @author  Rafael M Ortiz
*/
@RestController
@RequestMapping(ResourcePath.USER)
public class UserWS {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserWS.class);

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = ResourcePath.Usuario.FIND_BY_ID, method = RequestMethod.GET)
	@ResponseBody
	public User findById(@PathVariable("id") Long id) throws BusinessException, Exception {
		LOGGER.info("findById: " + id);

		User user = userService.findById(id);
		LOGGER.info(user.getId().toString());
		return user;
	}

	@RequestMapping(value = ResourcePath.Usuario.FIND_BY_LOGIN, method = RequestMethod.GET)
	@ResponseBody
	public User findByLogin(@PathVariable("login") String login) throws BusinessException, Exception {
		LOGGER.info("findByLogin: " + login);

		User user = userService.findByLogin(login);
		LOGGER.info(user.getId().toString());
		return user;
	}

}
