package com.bit.sts06.controller;

import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.sts06.model.entity.BbsVo;
import com.bit.sts06.service.BbsService;

@Controller
@RequestMapping("/bbs/")
public class BbsController {
	
	@Inject
	BbsService bbsService;

	@RequestMapping("list")
	public String list(Model model) {
		try {
			model.addAttribute("list", bbsService.list());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "list";
	}
	
	@RequestMapping(value="list/{idx}",method=RequestMethod.GET)
	public String detail(@PathVariable("idx") int idx,Model model) {
		try {
			model.addAttribute("bean", bbsService.detail(idx));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "detail";
	}
	
	@RequestMapping(value="list/{idx}",method=RequestMethod.PUT)
	public String edit(@PathVariable("idx") int idx, @ModelAttribute("bean") BbsVo bean) {
		try {
			bbsService.edit(bean);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "redirect:"+idx;
	}
}









