package com.kr.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Batch {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	int id;
	Date startdate;
	String trainername;
	String techname;
	String batchname;
	
	
	public Batch() {
		super();
		
	}
	
	public Batch( int id,String trainername, String techname, Date startdate, String batchname) {
		
		super();
		this.id=id;
		this.startdate = startdate;
		this.trainername = trainername;
		this.techname = techname;
		this.batchname = batchname;
		
	}
	

	public int getId() {
		return id;
	}

	
	public String getBatchname() {
		return batchname;
	}

	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public String getTrainername() {
		return trainername;
	}

	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}

	public String getTechname() {
		return techname;
	}

	public void setTechname(String techname) {
		this.techname = techname;
	}

	@Override
	public String toString() {
		return "Batch [id=" + id + ", startdate=" + startdate + ", trainername=" + trainername + ", techname="
				+ techname + ", batchname=" + batchname + "]";
	}

	

	

	
}
