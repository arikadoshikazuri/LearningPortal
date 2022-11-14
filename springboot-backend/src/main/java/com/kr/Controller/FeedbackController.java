package com.kr.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kr.model.Feedback;
import com.kr.service.FeedbackService;
@CrossOrigin(origins="http://localhost:3001")
@RestController
@RequestMapping("api/feedback")
public class FeedbackController {
	
	@Autowired
    FeedbackService feedbackService;
	@GetMapping("/")
	public ResponseEntity<List<Feedback>> getAllFeedback(){
		List<Feedback> feedback = this.feedbackService.getAllFeedback();
		return new ResponseEntity<List<Feedback>>(feedback, HttpStatus.OK);
	}
	
	@PostMapping(path="/add")
    public Feedback addfeedback(@RequestBody Feedback feedback) {
		return feedbackService.addfeedback(feedback);
    }
}
