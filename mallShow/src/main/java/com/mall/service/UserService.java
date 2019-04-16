package com.mall.service;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserService {
	
	@RequestMapping(value="/login")
	public String login(String user, String password) {
		System.out.println("user:" + user);
		return "success";
	}
}
