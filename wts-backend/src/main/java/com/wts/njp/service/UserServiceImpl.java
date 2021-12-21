package com.wts.njp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wts.njp.dao.UserDao;
import com.wts.njp.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
    private UserDao userDao;

	@Override
	public List<User> listAllUsers() {
		return userDao.listAllUsers();
	}

	@Override
	public void save(User user) {
		userDao.save(user);
	}
	
	@Override
	public void update(User user) {
		User entity = userDao.findUserById(user.getId());
		
		if(entity != null) {
		
			entity.setName(user.getName());
			entity.setAge(user.getAge());
			entity.setEmail(user.getEmail());
		}
		
	}
	
	@Override
	public User findUserById(Long id) {
		return userDao.findUserById(id);
	}

	@Override
	public void deleteUser(Long id) {
		userDao.deleteUser(id);
	}
     
    
     
}