package com.chinasoft.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.chinasoft.mapper.GenderMapper;
import com.chinasoft.pojo.Gender;
import com.chinasoft.util.SessionUtil;

public class GenderMapperTest {
	public  SqlSessionFactory factory =SessionUtil.getSession();
	
    @Test
    public void getGender() {
		SqlSession session = factory.openSession();
		GenderMapper mapper = session.getMapper(GenderMapper.class);
		Gender gender=mapper.getGender(1);
		System.out.print(gender);
		session.close();
                System.out.print(8888);
	}
}
