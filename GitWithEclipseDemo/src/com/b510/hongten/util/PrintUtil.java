package com.b510.hongten.util;

import com.b510.hongten.entity.Student;

/**
 * @author Hongten
 * @created Mar 5, 2017
 */
public class PrintUtil {

	public static void main(String[] args) {
		Student student = new Student();
		student.setNo("S23213232D");
		student.setName("Hongten");
		student.setEmail("hongtenzone@foxmail.com");
		student.setAddress("Blk XXX Sinapore");
		
		System.out.println("Print information : " + student.toString());
	}
}
