package com.bit.sts05.model.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User06Vo {
	private int user_num;
	
	@NotEmpty
	@Email
	private String id;
	
	@NotNull
	@Size(min = 4, max = 6)
	private String pw;
	
	@NotNull
	@Size(min = 2, max = 5)
	private String name;
	
	public User06Vo() {
	}

	public User06Vo(int user_num, String id, String pw, String name) {
		super();
		this.user_num = user_num;
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public int getUser_num() {
		return user_num;
	}

	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User06Vo [user_num=" + user_num + ", id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
}
