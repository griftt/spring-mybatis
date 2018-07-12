package com.hc.bybatis_spring;

import java.sql.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mapper.UserMapper;
import com.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
public class UserMapperTest {
	
	@Autowired
	private UserMapper map;
	
	@Test
	@Ignore
	public void Test(){
		User user=map.selectByPrimaryKey(10);
		System.err.println(user.getAddress());
		
	}
	@Test
	public void Test2(){
		User user=new User();
		user.setSex(1);
		user.setBirthday(Date.valueOf("1999-10-10"));
		user.setUsername("heelo");
		user.setAddress("北京");
		map.insert(user);
		
		
		
	}
	
	
}
