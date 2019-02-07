package com.bit.sts06.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.sts06.model.BbsDao;

@Controller
@RequestMapping("/bbs/")
public class BbsController {
	
	@Autowired
//	@Qualifier("advised")
	BbsDao bbsDao;

	@RequestMapping("list")
	public String list(Model model) {
		try {
			model.addAttribute("list", bbsDao.selectAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "list";
	}
	
	@RequestMapping("list/{idx}")
	public String detail(@PathVariable("idx") int idx) {
		System.out.println(idx);
		try {
			bbsDao.selectOne(idx);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "intro";
	}
}









