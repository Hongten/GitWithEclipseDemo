package com.b510.hongten.xdocreport.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hongten
 * @created Mar 4, 2017
 */
public class School implements Serializable {

	private static final long serialVersionUID = 5437348410406961898L;

	private Long id;
	private String no;
	private String name;
	private String website;
	private String email;
	private String contactNo;
	private String fax;
	private String address;
	private List<Clazz> clazzs;

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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Clazz> getClazzs() {
		if (clazzs == null) {
			clazzs = new ArrayList<Clazz>();
		}
		return clazzs;
	}

	public void setClazzs(List<Clazz> clazzs) {
		this.clazzs = clazzs;
	}

}
