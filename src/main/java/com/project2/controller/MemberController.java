package com.project2.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.project2.Service.MemberService;
import com.project2.model.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	// 유저 로그인 뷰 페이지
	@GetMapping("/login")
	public String userLogin() {
		
		return "user/login";
	}
	
	// 유저 로그인
	@PostMapping("user/logincheck")
	public String login(MemberVO memberVo, HttpSession session, Model model) throws Exception {
		
		MemberVO vo = memberService.userLogin(memberVo);
		
		// 아이디 값이 없는 경우
		if (vo == null) {
			return "redirect:/login";
		} else if (!vo.getMemberPw().equals(vo.getMemberPw())) {
			System.out.println("비번이 틀림");
			return "redirect:/login";
		} else { // 로그인 성공
			session.setAttribute("member", vo.getMemberId());
			session.setAttribute("memberId", vo.getMemberName());
			return "redirect:/main";
		}
		
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) throws Exception {
		
			session.invalidate();
		
		return "redirect:/main";
	}
	
	//회원가입 뷰 페이지
	@GetMapping("/register")
	public String userSignUp() {
		
		return "user/register";
	}
}
