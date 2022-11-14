package com.kr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String batchname;
	public int communication;
	public int skills;
	public int support;
	public int handson;
	public String comment;
	
	public Feedback() {
		super();
	}
	
	public Feedback(String batchname,int communication,int skills,int support,int handson,String comment) {
		super();
	    this.batchname=batchname;
		this.communication=communication;
		this.skills=skills;
		this.support=support;
		this.handson=handson;
		this.comment=comment;
	
	}

	public String getBatchname() {
		return batchname;
	}

	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}

	public int getCommunication() {
		return communication;
	}

	public void setCommunication(int communication) {
		this.communication = communication;
	}

	public int getSkills() {
		return skills;
	}

	public void setSkills(int skills) {
		this.skills = skills;
	}

	public int getSupport() {
		return support;
	}

	public void setSupport(int support) {
		this.support = support;
	}

	public int getHandson() {
		return handson;
	}

	public void setHandson(int handson) {
		this.handson = handson;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
