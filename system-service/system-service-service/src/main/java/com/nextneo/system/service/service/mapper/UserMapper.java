package com.nextneo.system.service.service.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nextneo.system.framework.integration.dto.UserDto;
import com.nextneo.system.framework.models.entity.User;

/**
* @author  Rafael M Ortiz
*/
@Component
public class UserMapper {
	
	public UserDto userToUserDto(User user) {
		UserDto userDto = null;
		if (user != null) {
			userDto = new UserDto();
			userDto.setId(user.getId());
			userDto.setLogin(user.getLogin());
			userDto.setName(user.getName());
			userDto.setPassword(user.getPassword());
		}
		return userDto;
	}

	public User userDtoToUser(UserDto userDto) {
		User user = null;
		if (userDto != null) {
			user = new User();
			user.setId(userDto.getId());
			user.setLogin(userDto.getLogin());
			user.setName(userDto.getName());
			user.setPassword(userDto.getPassword());
		}
		return user;
	}

	public List<UserDto> userListToUserDtoList(List<User> userList) {
		List<UserDto> userListDto = null;
		if (userList != null && !userList.isEmpty()) {
			userListDto = new ArrayList<>();
			for (User user : userList) {
				UserDto userDto = userToUserDto(user);
				userListDto.add(userDto);
			}
		}
		return userListDto;
	}

	public List<User> userDtoListToUserList(List<UserDto> userDtoList) {
		List<User> userList = null;
		if (userDtoList != null && !userDtoList.isEmpty()) {
			userList = new ArrayList<>();
			for (UserDto userDto : userDtoList) {
				User user = userDtoToUser(userDto);
				userList.add(user);
			}
		}
		return userList;
	}

}
