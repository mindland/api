package com.myclass.entity;

import java.math.BigInteger;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
	private int id;
	private String firstName;
	private String lastName;
	protected String email;
	private String password;
	private String city;
	private String phone;
	private Date dateOfBirdth;
	private Date registerAt;
	private String lastLoginAt;
	private String updateAt;
	private String delete_at;
	private BigInteger cartId;

	public User() {
	}
}
