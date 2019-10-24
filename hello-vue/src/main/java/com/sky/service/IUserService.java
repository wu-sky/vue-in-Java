package com.sky.service;

import com.sky.entity.User;

import java.util.ArrayList;

/*
 *用户：sky-吴
 *日期：2019/10/24
 */
public interface IUserService{
	/**
	 * 查询全部用户
	 *
	 * @return
	 */
	ArrayList<User> findAll();

	/**
	 * @param userId
	 * @return
	 */
	User findUserById(Integer userId);


	void update(User obj);
	/*还有其他方法, 和业务*/

}
