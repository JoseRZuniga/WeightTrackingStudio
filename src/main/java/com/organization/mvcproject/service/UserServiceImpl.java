package com.organization.mvcproject.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
import com.organization.mvcproject.model.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	private static final AtomicLong count = new AtomicLong();
	private static List<User> users;
	
	
	public List<User> findAllUsers(){
		return users;
	}
	
	public User findById(long id) {
		for(User user: users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	public User findByName(String name) {
		for(User user: users) {
			if(user.getName() == name) {
				return user;
			}
		}
		return null;
	}
	
	public void saveUser(User user) {
		user.setId(count.incrementAndGet());
		users.add(user);
	}
	
	public void updateUser(User user) {
		int index = users.indexOf(user);
		users.set(index, user);
	}
	
	
	public void deleteUserById(long id) {
		for(Iterator<User> iterator = users.iterator(); iterator.hasNext();) {
			User user = iterator.next();
			if(user.getId() == id) {
				iterator.remove();
			}
		}
	}
	
	public boolean ifUserExist(User user) {
        return findByName(user.getName())!=null;
    }
     
    public void deleteAllUsers(){
        users.clear();
    }

}
