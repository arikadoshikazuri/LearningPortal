package com.kr.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.kr.model.Trainer;

import com.kr.service.TrainerService;
@CrossOrigin(origins="http://localhost:3001")
@RestController
@RequestMapping("api/trainer")
public class TrainerController {

	@Autowired
	TrainerService trainerService;
	
	
     @PostMapping("/register")
	    public ResponseEntity<Object> insertTrainer(@RequestBody Trainer trainer){
		
		Trainer res = trainerService.addTrainer(trainer);
		
		return new ResponseEntity<Object>(res, HttpStatus.CREATED);
        }
	
	
	@GetMapping("/")
	public ResponseEntity<List<Trainer>> getAllTrainer(){
		List<Trainer> trainers = this.trainerService.getTrainer();
		return new ResponseEntity<List<Trainer>>(trainers, HttpStatus.OK);
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<Object> loginTrainer(@RequestBody Map<String ,Object> body){
		Trainer res = this.trainerService.login(body.get("userid").toString(),body.get("password").toString());
		
		return ResponseEntity.ok(res);
	}
	
	
	
	
}


