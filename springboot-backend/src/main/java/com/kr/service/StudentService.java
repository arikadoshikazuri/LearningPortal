package com.kr.service;

import java.util.List;


import com.kr.model.Student;

public interface StudentService {
	
	public Student addStudent(Student student);
	
	public List<Student> getStudent();
	
	public Student login(String userid, String password);
	
	

}
