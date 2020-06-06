package com.chinasoft.pojo;

import java.util.List;

public class Gender {
	private int id;
	private String name;
	private String teacher;
	private List<Student> students;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Gender() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gender(int id, String name, String teacher, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.students = students;
	}
	@Override
	public String toString() {
		return "Gender [id=" + id + ", name=" + name + ", teacher=" + teacher + ", students=" + students + "]";
	}
	
}
