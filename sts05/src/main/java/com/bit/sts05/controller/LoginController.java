package com.bit.sts05.controller;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public void login() {}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(User06Vo bean, Model model) throws SQLException {
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
	public String join(@ModelAttribute("bean") @Valid User06Vo bean, BindingResult br) throws SQLException {
//		log.debug(br.hasErrors()+"");
//		log.debug(br.getErrorCount()+"");
//		List<ObjectError> errs = br.getAllErrors();
//		for(ObjectError err : errs) {
//			log.debug(err.getDefaultMessage());
//		}
		if(br.hasErrors())return "login/join";
		user06Dao.join(bean);
		return "login/result";
	}
	
}










