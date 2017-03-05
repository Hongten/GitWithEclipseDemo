package com.b510.hongten.entity;

import java.io.Serializable;

/**
 * @author Hongten
 * @created Mar 5, 2017
 */
public class Student implements Serializable {

	private static final long serialVersionUID = 9058842236560084831L;
	private String no;
	private String name;
	private String email;
	private String address;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}

}
