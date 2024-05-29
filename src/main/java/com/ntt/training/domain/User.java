package com.ntt.training.domain;

public class User {
	private int userid;
	private String username;
	private String password;
	private String city;
	private String email;
	private int contactno;
	public int getUserid() {
		return userid;
	}
public void setUserid(int userid) {
		this.userid = userid;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

	public User(int userid, String username, String password, String city, String email, int contactno) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.city = city;
		this.email = email;
		this.contactno = contactno;
	}

	public User() {
		super();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userid=");
		builder.append(userid);
		builder.append(", username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append(", city=");
		builder.append(city);
		builder.append(", email=");
		builder.append(email);
		builder.append(", contactno=");
		builder.append(contactno);
		builder.append("]");
		return builder.toString();
	}


}
