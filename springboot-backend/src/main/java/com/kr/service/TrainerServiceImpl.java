package com.kr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kr.Dao.TrainerRepository;
import com.kr.model.Trainer;

@Service
public class TrainerServiceImpl implements TrainerService{

	@Autowired
	TrainerRepository trainerRepo;
	
	
	
	@Override
	public List<Trainer> getTrainer() {
		// TODO Auto-generated method stub
		return this.trainerRepo.findAll();
	}

	@Override
	public Trainer login(String userid,String password) {
		// TODO Auto-generated method stub
		List<Trainer> allUser = this.trainerRepo.findAll();
		for(Trainer u : allUser) {
			if(u.getUserid().toLowerCase().equals(userid)) {
				if(u.getPassword().equals(password)) {
					return u;
				}
			}
		}
		return null;
	}

	@Override
	public Trainer addTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		return this.trainerRepo.save(trainer);
	}
	
	
	
	
	

}
