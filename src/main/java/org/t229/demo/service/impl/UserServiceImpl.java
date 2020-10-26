package org.t229.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.t229.demo.mapper.UserMapper;
import org.t229.demo.pojo.Users;
import org.t229.demo.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;

	public Users doLogin(String userName, String userpassword) {
		// TODO Auto-generated method stub
		return userMapper.doLogin(userName, userpassword);
	}

	public List<Users> getAllUsers(int pageSize,int pageNo) {
		// TODO Auto-generated method stub
		return userMapper.getAllUsers();
	}

}
