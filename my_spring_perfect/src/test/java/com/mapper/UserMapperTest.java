package com.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pojo.User;
import com.pojo.UserExample;
import com.pojo.UserExample.Criteria;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
public class UserMapperTest {
	
	@Autowired
	private UserMapper mapper;
	
	
	
	@Test
	public void test() {
		UserExample ex = new UserExample();
		Criteria c = ex.createCriteria();
		c.andIdGreaterThan(0);
		List<User> users=mapper.selectByExample(ex);
		System.out.println(users.size());
		
	}

}
