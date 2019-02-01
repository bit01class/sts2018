package com.bit.sts05.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.sts05.model.User06Dao;
import com.bit.sts05.model.entity.User06Vo;

@Controller
@RequestMapping("/login")
public class LoginController {
	Logger log=LoggerFactory.getLogger(this.getClass());
	@Autowired
	User06Dao user06Dao;

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(HttpSession session) {
		if(session.getAttribute("login")!=null)return "redirect:logout";
		return "login/login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(User06Vo bean, Model model, HttpSession session) throws SQLException {
		try {
			bean = user06Dao.login(bean);
		}catch(Exception e){
			bean=null;
		}
		if(bean==null) return "login/login";
		model.addAttribute("bean",bean);
		session.setAttribute("login", bean);
		return "login/success";
	}
	
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public void join() {}
	
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String join(@Valid User06Vo bean, BindingResult br, Model model) throws SQLException {
		
		Map<String,String> errs=new HashMap<String,String>();
		List<FieldError> ferr=br.getFieldErrors();
		for(int i=0; i<ferr.size(); i++) {
			String key=ferr.get(i).getField();
			String value=ferr.get(i).getDefaultMessage();
			errs.put(key, value);
		}
		model.addAttribute("err", errs);
		
		if(br.hasErrors())return "login/join";
		user06Dao.join(bean);
		return "login/result";
	}
	
	@RequestMapping("/logout")
	public void logout(HttpSession session) {
		session.invalidate();
	}
	
}










