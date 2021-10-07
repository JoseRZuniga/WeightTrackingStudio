package com.organization.mvcproject.model;

import java.math.BigDecimal;

public class User {
	
	private long id; 
	private String age;
	private String name;
	
	public User() {
		id=0;
	}
	
	public User(long id, String name, String age) {
		this.id = id;
		this.name = name;
		this.age = age;
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
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof User))
            return false;
        User other = (User) obj;
        if (id != other.id)
            return false;
        return true;
    }
	
	@Override 
	public String toString() {
		return "User [id = " + id + ", Name = " + name + ", Age = " + age;
	}
	
}
