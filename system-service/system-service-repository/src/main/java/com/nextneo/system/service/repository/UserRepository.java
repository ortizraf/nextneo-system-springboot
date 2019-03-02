package com.nextneo.system.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nextneo.system.framework.models.entity.User;
import com.nextneo.system.service.repository.impl.UserRepositoryCustom;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {
	
}