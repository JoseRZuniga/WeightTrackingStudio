package com.wts.njp.manager;

import java.util.List;

import com.wts.njp.model.UserView;

public interface UserManager {
	
	List<UserView> listAllUsers();
	
	void saveUser(UserView user);
	
	void updateUser(UserView user);
	
	UserView findUserById(Long id);
	
	void deleteUser(Long id);

}
