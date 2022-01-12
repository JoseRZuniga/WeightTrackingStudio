package com.wts.njp.service;

import java.util.List;

import com.wts.njp.model.User;

public interface UserService {
	
	List<User> listAllUsers();
	
	void save(User user);
	
	void update(User user);
	
	User findUserById(Long id);
	
	void deleteUser(Long id);

}