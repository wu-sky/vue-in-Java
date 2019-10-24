package com.sky.service.impl;

import com.sky.dao.IUserDao;
import com.sky.entity.User;
import com.sky.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/*
 *用户：sky-吴
 *日期：2019/10/24
 */
@Service
public class IUserServiceImpl implements IUserService {

	@Autowired
	IUserDao dao;


	public ArrayList<User> findAll() {
		ArrayList<User> objs= dao.findAll();
		return objs;
	}

	public User findUserById(Integer userId) {
		return dao.findUserById(userId);
	}

	public void update(User obj) {
		//dao.update(obj);
	}



}
