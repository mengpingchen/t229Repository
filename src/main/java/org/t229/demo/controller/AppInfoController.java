package org.t229.demo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.t229.demo.pojo.Users;
import org.t229.demo.service.UserService;
import org.t229.util.ResponseData;

import com.alibaba.fastjson.JSONArray;

@Controller
public class AppInfoController {
	
	@Resource
	private UserService UserService;
	
	@RequestMapping(value="/appList")
	public String appList(){
		
		return "appList";
	}
	
	/**
	 * 获取表格数据
	 * @return
	 */
	@RequestMapping(value="/getAppTableData")
	@ResponseBody
	public Object getAppTableData(
			@RequestParam(required = false, value="page") Integer page,
			@RequestParam(required = false, value="limit") Integer limit
			){
		ResponseData<Users> responseData = new ResponseData<Users>();
		
		System.out.println("page : "+page +"\t limit : "+limit);
		List<Users> userList = UserService.getAllUsers(0, 0);
		//String userJson = JSONArray.toJSONString(users);
		responseData.setCode(0);
		responseData.setCount(20);
		responseData.setData(userList);
		
		String jsonString = JSONArray.toJSONString(responseData);
		return jsonString;
	}
	

}
