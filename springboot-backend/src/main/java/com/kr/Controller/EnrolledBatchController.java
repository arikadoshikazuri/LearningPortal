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


import com.kr.model.Enrolledbatch;
import com.kr.service.EnrolledBatchService;
import com.kr.service.EnrolledBatchServiceImpl;
@CrossOrigin(origins="http://localhost:3001")
@RestController
@RequestMapping("/api/enrolled")
public class EnrolledBatchController {
	
	@Autowired
	EnrolledBatchService enrolledbatchservice;
	
	
	// Student
	
	@GetMapping("/")
	public ResponseEntity<List<Enrolledbatch>> getAllBatch(){
		List<Enrolledbatch> store=enrolledbatchservice.getAllEnrolledBatch();
		return new ResponseEntity<List<Enrolledbatch>>(store,HttpStatus.OK);
		
	}
	
	@PostMapping(path="/enroll")
    public Enrolledbatch addEnrolled (@RequestBody Enrolledbatch enrolledbatch) {
		return enrolledbatchservice.addEnrolled(enrolledbatch);
    }

}
