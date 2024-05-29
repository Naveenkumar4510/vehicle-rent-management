package com.ntt.training.domain;

public class admin {
private int adminid;
private String password;


public admin(int adminid, String password) {
	super();
	this.adminid = adminid;
	this.password = password;
}

public int getAdminid() {
	return adminid;
}
public void setAdminid(int adminid) {
	this.adminid = adminid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public admin() {
	super();
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("admin [adminid=");
	builder.append(adminid);
	builder.append(", password=");
	builder.append(password);
	builder.append("]");
	return builder.toString();
}
}
