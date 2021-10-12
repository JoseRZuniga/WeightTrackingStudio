package com.organization.mvcproject.model;


public class User {
	
	private long id; 
	private String age;
	private String name;
	private String password;

	
	public User() {
		id=0;
	}
	
	public User(long id, String name, String age, String password) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.password = password;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override 
	public String toString() {
		return "User [id = " + id + ", Name = " + name + ", Age = " + age;
	}
	
}
