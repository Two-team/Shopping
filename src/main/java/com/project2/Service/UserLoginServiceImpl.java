package com.project2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.mapper.UserLoginMapper;
import com.project2.model.UsersVO;

@Service
public class UserLoginServiceImpl implements UserLoginService {
	
	@Autowired
	private UserLoginMapper userLoginMapper;
	
	@Override
	public UsersVO userLogin(UsersVO usersVo) throws Exception {
		return userLoginMapper.userLogin(usersVo);
	}

}
