package com.simplesolutions.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
	
	private Integer userId;
	private String userName;
	private String userPwd;
	private Boolean	isActive;
	private String emailId;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public User() {
		super();
	}
	public User(Integer userId, String userName, String userPwd, Boolean isActive, String emailId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.isActive = isActive;
		this.emailId = emailId;
	}
	
	

}
