package com.wwj.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class User {
	
	@NotNull(message="id不能为空!")
	private  int  uid;
	@NotBlank(message="用户名不能为空!")
	private  String uname;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	

}
