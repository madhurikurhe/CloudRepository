package com.techlabs.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.User;
import com.techlabs.repository.UserRepository;

public class AuthenticationService {
	private List<User> users = null;

	public AuthenticationService() {
		users = new ArrayList<>();
	}

	public boolean checkUser(User authenticateUser) throws SQLException {
		UserRepository userRepo=new UserRepository();
		users=userRepo.getUsers();
		
		for (User user : users) {
			if (user.getUsername().equals(authenticateUser.getUsername())) {
				if (user.getPassword().equals(authenticateUser.getPassword())) {
					return true;
				}
			}
		}
		return false;
	}
}
