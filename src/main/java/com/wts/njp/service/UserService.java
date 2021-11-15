package com.wts.njp.service;

import java.util.List;

import com.wts.njp.model.User;

public interface UserService {
	
	public List<User> listAllUsers();
	
	public void saveOrUpdate(User user);
	
	public User findUserById(Integer id);
	
	public void deleteUser(Integer id);

}