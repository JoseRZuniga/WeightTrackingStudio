package com.wts.njp.dao;

import java.util.List;

import com.wts.njp.model.User;

public interface UserDao {
	
	public List<User> listAllUsers();
	
	public void saveOrUpdate(User user);
	
	public User findUserById(Integer id);
	
	public void deleteUser(Integer id);

}
