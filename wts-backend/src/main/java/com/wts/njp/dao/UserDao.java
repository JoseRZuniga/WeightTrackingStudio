package com.wts.njp.dao;

import java.util.List;

import com.wts.njp.model.User;

public interface UserDao {

	List<User> listAllUsers();
	void saveOrUpdate(User user);
	User findUserById(Long id);
	void deleteUser(Long id);

}
