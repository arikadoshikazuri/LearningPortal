package com.kr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kr.Dao.EnrolledRepository;

import com.kr.model.Enrolledbatch;

@Service
public class EnrolledBatchServiceImpl implements EnrolledBatchService{

	@Autowired
	EnrolledRepository enrolledrepo;

	@Override
	public Enrolledbatch addEnrolled(Enrolledbatch enrolledbatch) {
		// TODO Auto-generated method stub
		return enrolledrepo.save(enrolledbatch);
	}

	@Override
	public List<Enrolledbatch> getAllEnrolledBatch() {
		// TODO Auto-generated method stub
		System.out.println(enrolledrepo.findAll());
		return this.enrolledrepo.findAll();
	}

	

	
}
