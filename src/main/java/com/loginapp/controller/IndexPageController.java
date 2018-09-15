package com.loginapp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageController {
	@Value("${indexpage.message:test}")
	private String message;
	
	@RequestMapping("/")
	public String getIndexPage(Map<String,Object> model) {
		model.put("message",this.message);
		return "index";
	}
}
