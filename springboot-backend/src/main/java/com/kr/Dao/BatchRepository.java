package com.kr.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kr.model.Batch;

public interface BatchRepository extends JpaRepository<Batch, Integer> {

	String getByTrainername(String trainername);

}
