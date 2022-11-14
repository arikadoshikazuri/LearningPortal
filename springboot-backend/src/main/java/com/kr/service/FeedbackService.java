package com.kr.service;

import java.util.List;

import com.kr.model.Feedback;

public interface FeedbackService {
    
	public Feedback addfeedback(Feedback feedback);
	
	public List<Feedback> getAllFeedback();


}
