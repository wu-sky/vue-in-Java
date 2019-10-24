package com.sky;

import com.sky.dao.IUserDao;
import com.sky.entity.User;
import com.sky.service.IUserService;
import com.sky.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class VueApplicationTests {

	/**
	 * 假设这个类的代码不允许更改, 或者很多类都使用到了这些方法.
	 *
	 */


	/*第一种方式已经写死了, 耦合度太高了, 一旦这个类不符合要求, 代码改动是非常多的,

	达不到面向接口的要求*/
	@Autowired
	UserService service;


	@Test
	void contextLoads() {
	}

	@Test
	void getAll(){
		ArrayList<User> objs= service.findAll();
		System.out.println("=================user lis=================>");
		for(User obj:objs){
			System.out.println(obj.toString());;
		}
	}


	//==========================================================================//

	/*第二种方式, 我可随意使用任何一种实现类来注入, 因为我是接口, 实现类随便写*/
	@Autowired
	IUserService iUserService;

	@Test
	void getAll1(){
		ArrayList<User> objs= iUserService.findAll();
		System.out.println("=================user lis=================>");
		for(User obj:objs){
			System.out.println(obj.toString());;
		}
	}
}
