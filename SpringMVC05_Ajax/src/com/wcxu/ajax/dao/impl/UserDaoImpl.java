package com.wcxu.ajax.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wcxu.ajax.dao.DbUtil;
import com.wcxu.ajax.dao.UserDao;
import com.wcxu.ajax.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public List<User> findAll() throws Exception {
		Connection conn = DbUtil.getConnection();
		String sql = "select * from d_user";
		PreparedStatement pst = conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		List<User> list = new ArrayList<User>();
		while (rs.next()) {
			User usr = new User();
			usr.setId(rs.getInt("id"));
			usr.setName(rs.getString("name"));
			usr.setSex(rs.getString("sex"));
			usr.setSalary(rs.getDouble("salary"));
			list.add(usr);
		}
		conn.close();
		return list;
	}

	@Override
	public User findOne() throws Exception {
		Connection conn = DbUtil.getConnection();
		String sql = "select * from d_user limit 1";
		PreparedStatement pst = conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		List<User> list = new ArrayList<User>();
		while (rs.next()) {
			User usr = new User();
			usr.setId(rs.getInt("id"));
			usr.setName(rs.getString("name"));
			usr.setSex(rs.getString("sex"));
			usr.setSalary(rs.getDouble("salary"));
			list.add(usr);
		}
		conn.close();
		return list.get(0);
	}

}
