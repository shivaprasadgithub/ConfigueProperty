package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.componet.User;
@Repository
public class UserRepository {
    List<User> listUser = new ArrayList<>();
	public List<User> getAllUser() {
		return listUser;
	}
	public User getUser(String id) {
		Optional<User> first = listUser.stream()
				.filter(u -> u.getId().equals(id))
				.findFirst();
		if(first.isPresent()) {
			return first.get();
		}else {
			return new User();
		}
				
	}
	public void addUser(User user) {
		listUser.add(user);
	}
	public User updateUser(User user) {
		for(User ur :listUser) {
			if(ur.getId().equals(user.getId())) {
				user.setName(user.getName());
				user.setAdd(user.getAdd());
				return ur;
			}
		}
		return new User();
	}
	public User deleteUser(String id) {
		Optional<User> first = listUser.stream()
				.filter(u -> u.getId().equals(id))
				.findFirst();
		if(first.isPresent()) {
			User user= first.get();
			 listUser.remove(user);
			 return user;
		}else {
			return new User();
		}
				
	}

}
