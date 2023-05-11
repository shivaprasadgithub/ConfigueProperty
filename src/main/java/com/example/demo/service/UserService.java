package com.example.demo.service;

import java.util.List;

import com.example.demo.componet.User;

public interface UserService {

	List<User> gettAllUser();

	User getUser(String id);

	void addUser(User user);

	User updateUser(User user);

	User deleteUser(String id);

}
