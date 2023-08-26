package com.project2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserLoginController {
	
	// 유저 로그인 뷰 페이지
	@GetMapping("/login")
	public String userLogin() {
		
		return "user/login";
	}
	
	// 유저 로그인
	@PostMapping("/login")
	public String login() {
		return "";
	}
}
