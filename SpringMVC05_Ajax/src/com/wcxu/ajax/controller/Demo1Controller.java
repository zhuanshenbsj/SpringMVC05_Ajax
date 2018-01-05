package com.wcxu.ajax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wcxu.ajax.dao.UserDao;
import com.wcxu.ajax.dao.impl.UserDaoImpl;
import com.wcxu.ajax.entity.User;

@Controller
public class Demo1Controller {

	@Autowired
	private UserDao userDao;

	@RequestMapping("demo1.do")
	@ResponseBody
	public User execute() throws Exception {
		userDao = new UserDaoImpl();
		User usr = userDao.findOne();
		return usr;// user_list.jsp
	}
}
