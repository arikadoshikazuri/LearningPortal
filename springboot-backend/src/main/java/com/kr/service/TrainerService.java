package com.kr.service;

import java.util.List;


import com.kr.model.Trainer;

public interface TrainerService {
	
	public Trainer addTrainer(Trainer trainer);
	
	public List<Trainer> getTrainer();
	
	public Trainer login(String userid, String password);
	
	

}
