package com.chinasoft.mapper;

import java.util.List;

import com.chinasoft.pojo.Gender;
import com.chinasoft.pojo.Student;

public interface StudentMapper {
	
	//根据gender id查看班级学生
	List<Student> SelectStudentList(int id);
}
