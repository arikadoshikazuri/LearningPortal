package com.kr.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kr.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

	
}

