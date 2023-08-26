package com.project2.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.project2.model.UsersVO;

@Mapper
public interface UserLoginMapper {
	
	public UsersVO userLogin(UsersVO usersVo) throws Exception;
}
