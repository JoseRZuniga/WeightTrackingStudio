package com.wts.njp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wts.njp.model.User;

@Repository
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

	public void saveOrUpdate(User user) {
		getSession().saveOrUpdate(user);
	}

	public User findUserById(Integer id) {
		User user = (User) getSession().get(User.class, id);
		return user;
	}
	
	public void deleteUser(Integer id) {
		// specifying class name (User) not table name (user) 
		String hql = "delete from User where id = :id";
		Query query = getSession().createQuery(hql);
		query.setInteger("id", id);
		query.executeUpdate();
	}

}
