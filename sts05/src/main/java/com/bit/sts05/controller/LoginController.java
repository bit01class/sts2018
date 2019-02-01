package com.bit.sts05.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.sts05.model.User06Dao;
import com.bit.sts05.model.entity.User06Vo;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	User06Dao user06Dao;

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public void loginForm() {}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(String id, String pw, Model model) throws SQLException {
		User06Vo bean = user06Dao.login(id, pw);
		if(bean==null) return "login/login";
		model.addAttribute("bean",bean);
		return "login/success";
	}
}










