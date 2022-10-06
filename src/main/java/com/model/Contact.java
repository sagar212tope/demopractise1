package com.model;

import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Configuration;



public class Contact {
	
	@NotNull(message="name must not be blank")
	private String name;
	
	@NotNull(message="mobile number cannot be blank")
	private String mobileNum;
	
	@NotNull(message="subject cannot be blank")
	private String subject;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "Model [name=" + name + ", mobileNum=" + mobileNum + ", subject=" + subject + "]";
	}
	
	
	

}
