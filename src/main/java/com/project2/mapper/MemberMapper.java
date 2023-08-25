package com.project2.mapper;

import com.project2.model.memberVO;

public interface MemberMapper {

	//MemberMapper.xml의 memberJoin insert쿼리를 실행시켜줄 메서드 작성
	
	//회원가입
	public void memberJoin(memberVO member);
}
