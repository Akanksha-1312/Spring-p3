package com.samples.SpringMvcOrm.service;

import java.util.List;

import com.samples.SpringMvcOrm.entity.User;

public interface UserService {
	int save(User user);
	List<User> getUsers();

}