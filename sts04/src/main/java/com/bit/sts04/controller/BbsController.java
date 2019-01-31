package com.bit.sts04.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.sts04.model.Bbs06Dao;

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
}
