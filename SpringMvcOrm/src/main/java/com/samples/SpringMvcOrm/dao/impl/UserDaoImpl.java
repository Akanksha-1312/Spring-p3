package com.samples.SpringMvcOrm.dao.impl;


import java.util.List;

import com.samples.SpringMvcOrm.dao.UserDao;
import com.samples.SpringMvcOrm.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;


@Component
public class UserDaoImpl implements UserDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int create(User user) {
		// TODO Auto-generated method stub
		return (int) hibernateTemplate.save(user);
	}

	@Override
	public List<User> findUsers() {
		return hibernateTemplate.loadAll(User.class);
	}
	
	
}