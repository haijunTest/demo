package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.UserService;

@Controller
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService UserService;

	@GetMapping("/login")
	public String getInfo(String userName, String passWord) {
		String info = UserService.getInfo(userName, passWord);
		if ("success".equals(info)) {
			return "loginSuccess";
		}
		return "loginFail";
	}
}
