package com.chinasoft.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.chinasoft.mapper.StudentMapper;
import com.chinasoft.pojo.Student;
import com.chinasoft.util.SessionUtil;

public class StudentMapperTest {
	public  SqlSessionFactory factory =SessionUtil.getSession();
	
	//利用班级id查询本班同学
	@Test
	public void selectStudentList() {
		SqlSession session = factory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		List<Student> list = mapper.SelectStudentList(1);
		 for (Student student : list) {
	            System.out.println(student);
	        }
		session.close();
	}
	
	
}
