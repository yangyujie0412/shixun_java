package com.chinasoft.test;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.chinasoft.mapper.UserMapper;
import com.chinasoft.pojo.User;
import com.chinasoft.util.SessionUtil;

public class UserMapperTest {
	public SqlSessionFactory factory = SessionUtil.getSession();

	//动态sql添加user
	@Test
	public void addUser() {
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user=new User();
		user.setId(22);
		user.setUsername("Bruce");
		user.setPassword("123");
		mapper.addUser(user);
		session.commit();
		session.close();
	}

	// 分页查询
	@Test
	public void findUserByPage() {
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put("currIndex", 2);
		data.put("pageSize", 5);
		List<User> userlist= mapper.selectByPage(data);
		for(User user:userlist) {
			System.out.println(user);
		}
		session.close();
	}

}
