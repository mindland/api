package com.myclass.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.myclass.connection.SqlServerConnection;
import com.myclass.entity.User;

public class UserRepository {

	public User login(String email, String password) {
		String query = "SELECT * FROM User WHERE email = ? and password =  ? ";
		User user = new User();
		try (Connection connection = SqlServerConnection.getConnection()) {
			PreparedStatement statement = connection.prepareStatement(query);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;
	}
}
