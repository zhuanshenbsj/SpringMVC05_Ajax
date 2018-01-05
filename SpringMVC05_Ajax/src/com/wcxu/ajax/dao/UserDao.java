package com.wcxu.ajax.dao;

import java.util.List;

import com.wcxu.ajax.entity.User;

public interface UserDao {

	public List<User> findAll() throws Exception;

	public User findOne() throws Exception;

}
