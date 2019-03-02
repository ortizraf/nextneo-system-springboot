package com.nextneo.system.service.service;

import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nextneo.system.framework.models.entity.User;
import com.nextneo.system.framework.utils.exception.BusinessException;
import com.nextneo.system.framework.utils.messages.MessageProperties;
import com.nextneo.system.service.repository.UserRepository;

/**
* @author  Rafael M Ortiz
*/
@Service
public class UserService {
	
	private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());

	@Autowired
	private UserRepository repository;

	@Transactional(propagation = Propagation.REQUIRED)
	public User addUser(User user) throws BusinessException, Exception  {
		LOGGER.info(" addClient ");
		if (user.getId() != null) {
			throw new BusinessException(MessageProperties.getMessage("use_update_method"), null);
		}
		return repository.addUser(user);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public User updateUser(User user) throws BusinessException, Exception  {
		LOGGER.info(" updateUser ");
		if (user.getId() == null) {
			throw new BusinessException(MessageProperties.getMessage("user_id_required"), null);
		}

		return repository.updateUser(user);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void removeUser(User user) throws BusinessException, Exception  {
		LOGGER.info(" removeUser ");

		repository.removeUser(user);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public User findById(long id) throws BusinessException, Exception {
		LOGGER.info(" findById ");

		User user = repository.findById(id);
		if (user == null || user.getId() == null) {
			throw new BusinessException(MessageProperties.getMessage("user_not_found"), null);
		}
		return user;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public List<User> findById(Set<Long> usersId) throws BusinessException, Exception {
		LOGGER.info(" findById ");

		List<User> users = repository.findById(usersId);
		if (users == null || users.isEmpty()) {
			throw new BusinessException(MessageProperties.getMessage("user_not_found"), null);
		}
		return users;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public User findByLogin(String login) throws BusinessException, Exception {
		LOGGER.info("findByUsername");

		User user = repository.findByLogin(login);
		if (user == null || user.getId() == null) {
			throw new BusinessException(MessageProperties.getMessage("user_not_found"), null);
		}

		return user;

	}
	
}
