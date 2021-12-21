package com.wts.njp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.wts.njp.model.User;

@Repository
@EnableTransactionManagement
@Transactional
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<User> listAllUsers() {		
		Criteria criteria = getSession().createCriteria(User.class);
		return (List<User>) criteria.list();
	}

	public void save(User user) {
		getSession().save(user);
	}

	public User findUserById(Long id) {
		User user = (User) getSession().get(User.class, id);
		return user;
	}
	
	public void deleteUser(Long id) {
		User user = (User) getSession().get(User.class, id);
		getSession().delete(user);
	}

	
	

}
