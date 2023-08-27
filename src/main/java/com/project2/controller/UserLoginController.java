package com.project2.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.project2.Service.UserLoginService;
import com.project2.model.UsersVO;

@Controller
public class UserLoginController {
	
	@Autowired
	private UserLoginService usersLoginService;
	
	// 유저 로그인 뷰 페이지
	@GetMapping("/login")
	public String userLogin() {
		
		return "user/login";
	}
	
	// 유저 로그인
	@PostMapping("user/logincheck")
	public String login(UsersVO usersVo, HttpSession session, Model model) throws Exception {
		
		UsersVO vo = usersLoginService.userLogin(usersVo);
		
		// 아이디 값이 없는 경우
		if (vo == null) {
			return "user/login";
		} else { // 로그인 성공
			session.setAttribute("member", vo.getMemberId());
			// model.addAttribute("memberId", vo.getMemberId());
			return "redirect:/main";
		}
		
	}
}
