package com.chinasoft.mapper;

import java.util.List;

import com.chinasoft.pojo.Gender;
import com.chinasoft.pojo.Student;

public interface StudentMapper {
	
	//����gender id�鿴�༶ѧ��
	List<Student> SelectStudentList(int id);
}
