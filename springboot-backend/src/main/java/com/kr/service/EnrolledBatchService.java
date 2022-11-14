package com.kr.service;

import java.util.List;

import com.kr.model.Enrolledbatch;


public interface EnrolledBatchService {

	public List<Enrolledbatch> getAllEnrolledBatch();
	
	public Enrolledbatch addEnrolled(Enrolledbatch enrolledbatch);
	
}
	