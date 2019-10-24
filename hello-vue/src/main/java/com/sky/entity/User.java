package com.sky.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "t_user", schema = "db1902")
public class User  implements Serializable {
	private int id;
	private String name;
	private Date birthday;
	private String password;
	private String username;
	private Integer loginFlag;
	private Integer roleId;
	private String filePath;
	private Date createDate;
	private Integer sex;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "name", nullable = true, length = 32)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "birthday", nullable = true)
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Basic
	@Column(name = "password", nullable = true, length = 32)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Basic
	@Column(name = "username", nullable = true, length = 32)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Basic
	@Column(name = "login_flag", nullable = true)
	public Integer getLoginFlag() {
		return loginFlag;
	}

	public void setLoginFlag(Integer loginFlag) {
		this.loginFlag = loginFlag;
	}

	@Basic
	@Column(name = "role_id", nullable = true)
	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Basic
	@Column(name = "file_path", nullable = true, length = 64)
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Basic
	@Column(name = "create_date", nullable = true)
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Basic
	@Column(name = "sex", nullable = true)
	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User tUser = (User) o;
		return id == tUser.id &&
				Objects.equals(name, tUser.name) &&
				Objects.equals(birthday, tUser.birthday) &&
				Objects.equals(password, tUser.password) &&
				Objects.equals(username, tUser.username) &&
				Objects.equals(loginFlag, tUser.loginFlag) &&
				Objects.equals(roleId, tUser.roleId) &&
				Objects.equals(filePath, tUser.filePath) &&
				Objects.equals(createDate, tUser.createDate) &&
				Objects.equals(sex, tUser.sex);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, birthday, password, username, loginFlag, roleId, filePath, createDate, sex);
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", birthday=" + birthday +
				", password='" + password + '\'' +
				", username='" + username + '\'' +
				", loginFlag=" + loginFlag +
				", roleId=" + roleId +
				", filePath='" + filePath + '\'' +
				", createDate=" + createDate +
				", sex=" + sex +
				'}';
	}
}




/*
 *用户：sky-吴
 *日期：2019/10/16
 */