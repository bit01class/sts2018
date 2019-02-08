package com.bit.sts07.controller;

import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.sts07.model.entity.Bbs2Vo;
import com.bit.sts07.service.Bbs2Service;

@Controller
public class Bbs2Controller {
	@Inject
	Bbs2Service bbs2Service;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String list(Model model) {
		try {
			model.addAttribute("list", bbs2Service.list());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "list";
	}
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public String add(Bbs2Vo bean) {
		try {
			bbs2Service.add(bean);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "redirect:./";
	}
	
	@RequestMapping(value="/{idx}",method=RequestMethod.GET)
	public String detail(@PathVariable("idx") int idx, Model model) {
		try {
			model.addAttribute("bean", bbs2Service.detail(idx));
			System.out.println(idx);
			System.out.println(bbs2Service.detail(idx));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "detail";
	}
	
	@RequestMapping(value="/{idx}",method=RequestMethod.PUT)
	public String edit(@PathVariable int idx,Bbs2Vo bean) {
		try {
			if(bbs2Service.edit(bean)>0)return "redirect:"+bean.getNum();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "redirect:./";
	}
	
	@RequestMapping(value="/{idx}",method=RequestMethod.DELETE)
	public String del(@PathVariable int idx) {
		System.out.println("del:"+idx);
		try {
			bbs2Service.delete(idx);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "redirect:./";
	}
}













