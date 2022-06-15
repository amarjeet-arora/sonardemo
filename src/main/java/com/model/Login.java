package com.model;

public class Login {
private String uname;

 
public Login(String uname, String pass) {
	super();
	this.uname = uname;
	this.pass = pass;
}

private String pass;

public Login() {
	super();
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}

}
