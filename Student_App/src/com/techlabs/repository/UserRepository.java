package com.techlabs.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.User;
import com.techlabs.utility.CreateConnection;

public class UserRepository {
	CreateConnection createConnection = null;
	Connection connection = null;
	
	public UserRepository() {
		createConnection =CreateConnection.getConnectionInstance();
		connection = createConnection.getConnection();
	}
		

	public List<User> getUsers() throws SQLException {
		List<User> users = new ArrayList<User>();
		PreparedStatement statement = connection.prepareStatement("select * from user");
		ResultSet result = statement.executeQuery();
		while(result.next()) {
			users.add(new User(result.getString("username"), result.getString("password")));
		}
		return users;
	}
	
}
