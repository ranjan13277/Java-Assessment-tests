package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	private Integer userId;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer id;
	private String title;
	private String body;
	
	public Employee() {
		super();
		
	}
	
	public Employee(Integer userId,Integer id,String title,String body) {
		super();
		this.userId=userId;
		this.id=id;
		this.title=title;
		this.body=body;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setid(Integer id) {
		this.id = id;
	}
	
	
	public Integer getid() {
		return id;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Employee [userId=" + userId + ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}

}
