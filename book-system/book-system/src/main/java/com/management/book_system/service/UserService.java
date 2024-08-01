package com.management.book_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.book_system.entity.Account;
import com.management.book_system.repo.UserRepository;
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<Account> getUsersList() {
		List<Account> usersList = userRepository.findAll();
		return usersList;
	}

}
