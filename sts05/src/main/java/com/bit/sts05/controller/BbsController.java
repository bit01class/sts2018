package com.bit.sts05.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.sts05.model.Bbs06Dao;
import com.bit.sts05.model.entity.Bbs06Vo;

@Controller
@RequestMapping("/bbs/*")
public class BbsController {
	Logger log=LoggerFactory.getLogger(this.getClass());
	@Autowired
	Bbs06Dao bbs06Dao;
	
	@RequestMapping("list")
	public void list(Model model) throws SQLException {
		log.debug("list...");
		model.addAttribute("list",bbs06Dao.selectAll());
	}
	
	@RequestMapping(value="add",method=RequestMethod.GET)
	public void add() {}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(Bbs06Vo bean) throws SQLException {
		bbs06Dao.insertOne(bean);
		return "redirect:list";
	}
	
	@RequestMapping("detail")
	public void detail(int idx,Model model) throws SQLException {
		model.addAttribute("bean",bbs06Dao.selectOne(idx));
	}
}





























