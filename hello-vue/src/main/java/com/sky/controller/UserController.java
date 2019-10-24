package com.sky.controller;

/*
 *用户：sky-吴
 *日期：2019/10/23
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sky.mapper.IUserMapper;
import com.sky.entity.User;
import com.sky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class UserController {



	@Autowired
	UserService service;

	@RequestMapping("user.html")
	public String toUser(){
		return "user";
	}
	@RequestMapping("/getUsers")
	@ResponseBody
	public String getUsers() throws JsonProcessingException {
		System.out.println("有请求到达====> getUsers ");
		ArrayList<User> users=service.findAll();
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(users);
		return json;
	}


	@ResponseBody
	@RequestMapping("/getById")
	public String getUserById(Integer userId) throws JsonProcessingException {
		System.out.println("有请求到达====> getById ");
		User obj=service.findUserById(userId);
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writeValueAsString(obj);
		return json;
	}

	@RequestMapping("/updateUser")
	public  void updateUser(User obj){
		System.out.println("有请求到达====> updateUser ");
		service.update(obj);
	}


}
