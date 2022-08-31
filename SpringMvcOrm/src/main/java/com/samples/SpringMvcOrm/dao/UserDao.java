package com.samples.SpringMvcOrm.dao;

import java.util.List;

import com.samples.SpringMvcOrm.entity.User;

public interface UserDao {
	int create(User user);

	List<User> findUsers();

}
