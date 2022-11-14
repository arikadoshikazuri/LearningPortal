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


import com.kr.model.Student;

import com.kr.service.StudentService;
@CrossOrigin(origins="http://localhost:3001")
@RestController
@RequestMapping("api/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	
	
	@PostMapping("/register")
	    public ResponseEntity<Object> insertStudent(@RequestBody Student student){
		
		Student res = studentService.addStudent(student);
		
		return new ResponseEntity<Object>(res, HttpStatus.CREATED);
        }
	
	
	@GetMapping("")
	public ResponseEntity<List<Student>> getAllStudent(){
		List<Student> students = this.studentService.getStudent();
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<Object> loginTrainer(@RequestBody Map<String ,Object> body){
		Student res = this.studentService.login(body.get("userid").toString(),body.get("password").toString());
		
		return ResponseEntity.ok(res);
	}
	
	
	
}


