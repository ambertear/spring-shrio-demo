package com.sping.shiro.demo.model;
 
import java.io.Serializable;
 
public class User implements Serializable {
	
	private static final long serialVersionUID = 7416373978493379166L;
	
	private int id;
	private String username;
	private String password;
	private String salt;
	
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", salt=" + salt + "]";
	}
 
 
}
