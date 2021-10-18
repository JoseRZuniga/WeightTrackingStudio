package com.wts.njp.service;
import java.util.List;

import com.wts.njp.model.User;

public interface UserService {
	
    List<User> retrieveAllUsers(); 
    User saveUser(User user);
}
