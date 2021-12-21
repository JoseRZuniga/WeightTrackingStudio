package com.wts.njp.manager;

import java.util.List;

import com.wts.njp.model.UserView;

public interface UserManager {
	
	List<UserView> listAllUsers();
	
	UserView saveUser(UserView user);
	
	UserView updateUser(UserView user);
	
	UserView findUserById(Long id);
	
	void deleteUser(Long id);

}
