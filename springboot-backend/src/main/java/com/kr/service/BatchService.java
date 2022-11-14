package com.kr.service;

import java.util.List;



import com.kr.model.Batch;

public interface BatchService {

	
	// admin
	public Batch addBatch(Batch batch);
	
	public List<Batch> getAllBatch();
	
	
	
	
	public void deleteBatch(int id);
	
	
	
	
	
	
	
}

