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
	
	
    UserDao userDao;
    
    @Autowired
	public void setUserDao(UserDao dao) {
		this.userDao = dao;
	}

	
	public List<User> listAllUsers() {
		return userDao.listAllUsers();
	}

	
	public void saveOrUpdate(User user) {
		userDao.saveOrUpdate(user);
	}
	
	public User findUserById(Integer id) {
		return userDao.findUserById(id);
	}

	
	public void deleteUser(Integer id) {
		userDao.deleteUser(id);
	}
     
    
     
}