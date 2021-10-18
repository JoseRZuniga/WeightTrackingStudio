package com.wts.njp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wts.njp.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	private static Long userId;
	private static List<User> users = new ArrayList<User>();
	
	
	
	@Override
	public List<User> retrieveAllUsers(){
		return users;
	}
	
	@Override
	public User saveUser(User user) {
		user.setId(++userId);
		users.add(user);
		return user;
	}
	
	public static Long getUserId() {
		return userId;
	}
	public static void setUserId(Long userId) {
		UserServiceImpl.userId = userId;
	}

	public static List<User> getUsers() {
		return users;
	}

	public static void setUsers(ArrayList<User> users) {
		UserServiceImpl.users = users;
	}

}
