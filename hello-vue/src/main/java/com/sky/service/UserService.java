package com.sky.service;

import com.sky.mapper.IUserMapper;
import com.sky.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/*
 *用户：sky-吴
 *日期：2019/10/23
 *
 */
@Service
public class UserService {

	@Autowired
	IUserMapper mapper;


	public ArrayList<User> findAll() {
		ArrayList<User> objs= mapper.findAll();
		return objs;
	}

	public User findUserById(Integer userId) {
		return mapper.findUserById(userId);
	}

	public void update(User obj) {
		//mapper.update(obj);
	}
}
