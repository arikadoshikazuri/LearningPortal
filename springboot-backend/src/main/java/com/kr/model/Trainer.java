package com.kr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Trainer")
public class Trainer {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
  public int id;
  public String trainername;
  public String  email;
  public String userid;
  public String password;
  public String techname;
  
  
 
  

public String getTrainerName() {
	return trainername;
}


public void setName(String trainername) {
	this.trainername = trainername;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}



public String getTechname() {
	return techname;
}


public void setTechname(String techname) {
	this.techname = techname;
}



public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getUserid() {
	return userid;
}


public void setUserid(String userid) {
	this.userid = userid;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}
  
  
}

