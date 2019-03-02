package com.nextneo.system.service.repository.impl;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.nextneo.system.framework.models.entity.User;

/**
* @author  Rafael M Ortiz
*/

public class UserRepositoryImpl implements UserRepositoryCustom {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public User addUser(User user) {
		em.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		em.merge(user);
		return user;
	}
	
	@Override
	public void removeUser(User user) {
		em.remove(em.contains(user) ? user : em.merge(user));
	}

	@Override
	public User findById(long id) {

		TypedQuery<User> query = em.createQuery("SELECT new User(u) from User u where u.id = :pId ", User.class);
		query.setParameter("pId", id);

		User user = null;
		try {
			user = query.setMaxResults(1).getSingleResult();
		} catch (NoResultException nre) {
			/* NoResultException */
		}

		return user;
	}

	@Override
	public List<User> findById(Set<Long> ids) {

		TypedQuery<User> query = em.createQuery("SELECT new User(u) from User u where u.id in :pIds ", User.class);
		query.setParameter("pIds", ids);

		List<User> userList = query.getResultList();
		return userList;
	}

	@Override
	public User findByLogin(String login) {

		TypedQuery<User> query = em.createQuery("SELECT new User(u) from User u where u.login = :pLogin ",
				User.class);
		query.setParameter("pLogin", login);

		User user = null;
		try {
			user = query.setMaxResults(1).getSingleResult();
		} catch (NoResultException nre) {
			/* NoResultException */
		}

		return user;
	}

}
