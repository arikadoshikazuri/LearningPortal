package com.kr.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kr.model.Batch;
import com.kr.service.BatchService;
import com.kr.service.BatchServiceImpl;
@CrossOrigin(origins="http://localhost:3001")
@RestController
@RequestMapping("/api/batch")
public class BatchController {
	
	@Autowired
	BatchService batchservice;
	
	@PostMapping("/")
	public ResponseEntity<Object> insertBatch(@RequestBody Batch batch){
		
		Batch res = batchservice.addBatch(batch);
		
		if(res == null) {
			return new ResponseEntity<Object>("Valid Create Role Not Found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Object>(res, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/")
	public ResponseEntity<List<Batch>> getAllBatch(){
		List<Batch> store=batchservice.getAllBatch();
		return new ResponseEntity<List<Batch>>(store,HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("/{id}")
	   
       public String deleteBatch(@PathVariable int id) {
			   
		batchservice.deleteBatch(id);
		return "batch deleted successfully";
		
	   }
	
	}
	
	
	

	
	
	
	
	


