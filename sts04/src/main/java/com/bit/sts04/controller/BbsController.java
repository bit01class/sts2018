package com.bit.sts04.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.sts04.model.Bbs06Dao;
import com.bit.sts04.model.entity.Bbs06Vo;

@Controller
@RequestMapping("/bbs")
public class BbsController {
	@Autowired
	Bbs06Dao bbs06Dao;

	@RequestMapping("/list")
	public String list(Model model) throws SQLException {
		model.addAttribute("list", bbs06Dao.selectAll());
		return "list";
	}
	
	@RequestMapping("/add")
	public String add() {
		return "add";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(Bbs06Vo bean) throws SQLException {
		bbs06Dao.insertOne(bean);
		return "redirect:list";
	}
	
	@RequestMapping("/detail")
	public String detail(int idx,Model model) throws SQLException {
		
		model.addAttribute("bean", bbs06Dao.selectOne(idx));
		return "detail";
	}
}












