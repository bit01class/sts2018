package com.bit.sts08;

import java.sql.SQLException;
import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit.sts08.model.Bbs02Dao;
import com.bit.sts08.model.entity.Bbs02Vo;

@Controller
public class HomeController {
	
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	
	
}












