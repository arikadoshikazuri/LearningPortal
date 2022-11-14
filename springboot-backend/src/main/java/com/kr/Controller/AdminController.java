package com.kr.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kr.model.Admin;

import com.kr.service.AdminService;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping("api/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@PostMapping("/login")
	public ResponseEntity<Object> loginTrainer(@RequestBody Map<String ,Object> body){
		Admin res = this.adminService.login(body.get("userid").toString(),body.get("password").toString());
		
		return ResponseEntity.ok(res);
	}
	
}
