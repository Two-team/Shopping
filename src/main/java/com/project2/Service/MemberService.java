package com.project2.Service;

import com.project2.model.MemberVO;

public interface MemberService {
	
	//로그인
	public MemberVO userLogin(MemberVO memberVo) throws Exception;
	
	//회원가입
	void userSignUp(MemberVO memberVo) throws Exception;
}
