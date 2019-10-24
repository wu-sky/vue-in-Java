package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.ArrayList;

/*
 *用户：sky-吴
 *日期：2019/10/23
 */
@Mapper
public interface IUserMapper {

	/**
	 * 查询全部用户
	 * @return
	 */
	@Select("select * from t_user")
	ArrayList<User> findAll();

	/**
	 *
	 * @param userId
	 * @return
	 */
	@Select("select * from  t_user where id = #{userId}")
	User findUserById(Integer userId);


	@Update("update t_user set username=#{username}, name=#{name}," +
			" password=#{password}, sex=#{sex} , create_date=#{createDate} " +
			"     where id=#{id}" )
	void update(User obj);
	/*还有其他方法, 和业务*/
}

/*private int id;
	private String name;
	private Date birthday;
	private String password;
	private String username;
	private Integer loginFlag;
	private Integer roleId;
	private String filePath;
	private Date createDate;
	private Integer sex;*/