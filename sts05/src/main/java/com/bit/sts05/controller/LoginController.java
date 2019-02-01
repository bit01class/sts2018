package com.bit.sts05.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public void login() {}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@ModelAttribute User06Vo bean, Model model) throws SQLException {
		try {
			bean = user06Dao.login(bean);
		}catch(Exception e){
			bean=null;
		}
		if(bean==null) return "login/login";
		model.addAttribute("bean",bean);
		return "login/success";
	}
	
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public void join() {}
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String join(User06Vo bean) {
		
		return "login/join";
	}
	
}










