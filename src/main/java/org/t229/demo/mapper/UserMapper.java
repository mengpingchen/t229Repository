package org.t229.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.t229.demo.pojo.Users;

public interface UserMapper {
	/**
	 * 用户登录
	 * @param userName
	 * @param userpassword
	 * @return
	 */
	
	public Users doLogin(@Param("userName") String userName,@Param("userpassword")String userpassword);

	/**
	 * ��ȡ�����û���Ϣ
	 * @return
	 */
	public List<Users> getAllUsers();
}
