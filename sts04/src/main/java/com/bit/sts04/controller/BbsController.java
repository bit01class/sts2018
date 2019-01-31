package com.bit.sts04.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.sts04.model.Bbs06Dao;

@Controller
@RequestMapping("/bbs")
public class BbsController {
	@Autowired
	Bbs06Dao bbs06Dao;

	@RequestMapping("/list")
	public String list() throws SQLException {
		bbs06Dao.selectAll();
		return "list";
	}
	
	@RequestMapping("/add")
	public String add() {
		return "add";
	}
}
