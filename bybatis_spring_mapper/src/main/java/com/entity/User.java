package com.entity;

import java.util.Date;

public class User {

	private Integer id;
	private String username;
	private Date birthday;
	private int sex;
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public User(){
		
	}
	public User(String username, Date birthday, int sex, String address) {
		super();
		this.username = username;
		this.birthday = birthday;
		this.sex = sex;
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", birthday=" + birthday + ", sex=" + sex + ", address="
				+ address + "]";
	}
	
	
}
