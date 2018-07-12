package com.mapper;

import java.util.List;

import com.entity.User;

public interface UserMapper {

	public List<User> selectUsers();
	public User selectById(int id);
}
