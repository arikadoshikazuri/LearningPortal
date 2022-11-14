package com.kr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kr.Dao.FeedbackRepository;
import com.kr.model.Feedback;

@Service
public class FeedbackServiceImpl implements FeedbackService{

	@Autowired
	FeedbackRepository feedbackrepo;
	
	@Override
	public Feedback addfeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return this.feedbackrepo.save(feedback);
	}

	@Override
	public List<Feedback> getAllFeedback() {
		// TODO Auto-generated method stub
		return this.feedbackrepo.findAll();
	}
	
	

}
