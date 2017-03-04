package com.b510.hongten.xdocreport.entity;

import java.io.Serializable;

/**
 * @author hongten
 * @created Mar 4, 2017
 */
public class Student implements Serializable {

	private static final long serialVersionUID = 403095345634683339L;

	private Long id;
	private String no;
	private String name;
	private String email;
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

}
