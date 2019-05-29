package com.coffee.CoffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserJDBCDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<User> findAllUsers() {
		return jdbcTemplate.query("SELECT * FROM users", new BeanPropertyRowMapper<User>(User.class));
	}
	
	public int addUser(String username, String password, String firstname, String lastname, String email, String gender, String bday) {
		String addQuery = "INSERT INTO users(username, password, firstname, lastname, email, gender, bday) values(?,?,?,?,?,?,?)";
		return jdbcTemplate.update(addQuery, username, password, firstname, lastname, email, gender, bday);
	}
	
	

}
