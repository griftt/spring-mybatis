package com.hc.bybatis_spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.User;

import dao.UserDao;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
public class springTest {
	@Autowired
	private UserDao userDao;
	
	
	@Test
	public void test() {
		User user=userDao.selectById(1);
		System.out.println(user);
	}

}
