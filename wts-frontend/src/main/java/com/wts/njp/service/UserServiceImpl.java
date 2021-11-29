package com.wts.njp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wts.njp.dao.UserDao;
import com.wts.njp.model.User;

@Service

public class UserServiceImpl implements UserService{
	
	@Autowired
    private UserDao userDao;
    
    @Override
    @Transactional
	public List<User> listAllUsers() {
		return userDao.listAllUsers();
	}
	
    @Override
    @Transactional
	public void saveOrUpdate(User user) {
		userDao.saveOrUpdate(user);
	}
	
    @Override
    @Transactional
	public User findUserById(Long id) {
		return userDao.findUserById(id);
	}
    
    @Override
    @Transactional
	public void deleteUser(Long id) {
		userDao.deleteUser(id);
	}
     
}