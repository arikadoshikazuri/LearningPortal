package com.kr.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Enrolledbatch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String studentname;
	String trainername;
	String batchname;
	String techname;
	Date  startdate;
	
	public Enrolledbatch()
	{
		super();
	
	}
	
	public Enrolledbatch(int id, String studentname, String trainername, String batchname, String techname,Date startdate)
	{	
	super();
	this.id = id;
	this.studentname = studentname;
	this.trainername = trainername;
	this.batchname = batchname;
	this.techname = techname;
	this.startdate = startdate;
	
	}

	public Date getStartDate() {
		return startdate;
	}

	public void setStartDate(Date startdate) {
		this.startdate = startdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getTrainername() {
		return trainername;
	}

	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}

	public String getBatchname() {
		return batchname;
	}

	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}

	public String getTechname() {
		return techname;
	}

	public void setTechname(String techname) {
		this.techname = techname;
	}

	@Override
	public String toString() {
		return "Enrolledbatch [id=" + id + ", studentname=" + studentname + ", trainername=" + trainername
				+ ", batchname=" + batchname + ", techname=" + techname + ", startdate=" + startdate + "]";
	}

	
	}
	

