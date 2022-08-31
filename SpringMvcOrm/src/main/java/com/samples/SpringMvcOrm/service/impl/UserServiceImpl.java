package com.samples.SpringMvcOrm.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import com.samples.SpringMvcOrm.dao.UserDao;
import com.samples.SpringMvcOrm.entity.User;
import com.samples.SpringMvcOrm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userdao;

	@Override
	@Transactional
	public int save(User user) {
		return userdao.create(user);
	}

	@Override
	public List<User> getUsers() {
		return userdao.findUsers();
	}
	
}
