package org.t229.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.t229.demo.pojo.Users;

public interface UserService {
	/**
	 * 鐢ㄦ埛鐧诲綍
	 * @param userName
	 * @param userpassword
	 * @return
	 */
	
	public Users doLogin(@Param("userName") String userName,@Param("userpassword")String userpassword);

	
	/**
	 * 获取所有用户信息
	 * @return
	 */
	public List<Users> getAllUsers(int pageSize,int pageNo);
	
}
