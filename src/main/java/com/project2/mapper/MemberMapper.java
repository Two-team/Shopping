package com.project2.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.project2.model.MemberVO;

@Mapper
public interface MemberMapper {
	
	//로그인
	public MemberVO userLogin(MemberVO memberVo) throws Exception;
	
	//회원가입
	public void userSignUp(MemberVO memberVo) throws Exception;

	
}
