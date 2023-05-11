package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.componet.User;
import com.example.demo.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
    private UserRepository userRepository;
	@Override
	public List<User> gettAllUser() {
		return userRepository.getAllUser();
	}

	@Override
	public User getUser(String id) {
		return userRepository.getUser(id) ;
	}

	@Override
	public void addUser(User user) {
		userRepository.addUser(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.updateUser(user);
	}

	@Override
	public User deleteUser(String id) {
		return userRepository.deleteUser(id);
	}

}
