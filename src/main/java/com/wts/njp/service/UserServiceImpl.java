package com.wts.njp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wts.njp.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	private static Long userId = new Long(0);
	private static List<User> users = new ArrayList<User>();
	
	static {
		users = populateUsers();
	}

	private static List<User> populateUsers() {

		User user1 = new User();
		user1.setId(++userId);
		user1.setName("Jose");
		user1.setAge("23");
		user1.setEmail("jr@gmail.com");

		users.add(user1);

		return users;
	}
	
	
	public List<User> retrieveAllUsers(){
		return users;
	}
	
	
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