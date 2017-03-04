package com.b510.hongten.xdocreport.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hongten
 * @created Mar 4, 2017
 */
public class Clazz implements Serializable {

	private static final long serialVersionUID = -8708659530973782749L;

	private Long id;
	private String no;
	private String name;
	private String address;
	private List<Student> students;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Student> getStudents() {
		if(students == null){
			students = new ArrayList<Student>();
		}
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
