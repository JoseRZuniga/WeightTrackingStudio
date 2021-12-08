package com.wts.njp.service;

import java.util.List;

import com.wts.njp.model.User;

public interface UserService {
	
	List<User> listAllUsers();
	
	void saveOrUpdate(User user);
	
	User findUserById(Integer id);
	
	void deleteUser(Integer id);

}