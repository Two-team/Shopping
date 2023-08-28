package com.project2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.mapper.MemberMapper;
import com.project2.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	
		
	@Autowired
	private MemberMapper memberMapper;
	
	//로그인
	@Override
	public MemberVO userLogin(MemberVO memberVo) throws Exception {
		return memberMapper.userLogin(memberVo);
	}
	
	//회원가입
	@Override
	public void userSignUp(MemberVO memberVo) throws Exception {
		memberMapper.userSignUp(memberVo);
	}

}
