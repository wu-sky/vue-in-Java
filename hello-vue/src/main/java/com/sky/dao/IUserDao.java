package com.sky.dao;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.ArrayList;

/*
 *用户：sky-吴
 *日期：2019/10/24
 */
@Mapper
public interface IUserDao {


	/**
	 * 查询全部用户
	 *
	 * @return
	 */
	@Select("select * from t_user")
	ArrayList<User> findAll();

	/**
	 * @param userId
	 * @return
	 */
	@Select("select * from  t_user where id = #{userId}")
	User findUserById(Integer userId);


	@Update("update t_user set username=#{username}, name=#{name}," +
			" password=#{password}, sex=#{sex} , create_date=#{createDate} " +
			"     where id=#{id}")
	void update(User obj);
	/*还有其他方法, 和业务*/
}

