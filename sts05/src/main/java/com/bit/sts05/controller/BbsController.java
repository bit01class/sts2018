package com.bit.sts05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bbs/*")
public class BbsController {
	
	@RequestMapping("list")
	public void list() {}
}
