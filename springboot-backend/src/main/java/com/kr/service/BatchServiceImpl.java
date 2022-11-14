package com.kr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kr.Dao.BatchRepository;
import com.kr.model.Batch;

@Service
public class BatchServiceImpl implements BatchService{
	
	@Autowired
	BatchRepository batchRepo;

	// Admin
	@Override
	public Batch addBatch(Batch batch) {
		// TODO Auto-generated method stub
		return this.batchRepo.save(batch);
	}

	@Override
	public List<Batch> getAllBatch() {
		// TODO Auto-generated method stub
		System.out.println(batchRepo.findAll());
		return this.batchRepo.findAll();
	}
	
	@Override
	public void deleteBatch(int id) {
		this.batchRepo.deleteById(id);
	}

	

	
	
}
