package com.kr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kr.Dao.StudentRepository;
import com.kr.model.Student;

@Service
public class StudentServiceImplimentation implements StudentService{

	@Autowired
	StudentRepository studentRepo;
	
	
	
	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return this.studentRepo.findAll();
	}

	@Override
	public Student login(String userid,String password) {
		// TODO Auto-generated method stub
		List<Student> allUser = this.studentRepo.findAll();
		for(Student u : allUser) {
			if(u.getUserid().toLowerCase().equals(userid)) {
				if(u.getPassword().equals(password)) {
					return u;
				}
			}
		}
		return null;
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return this.studentRepo.save(student);
	}
	
	
	
	
	
	
	

}
