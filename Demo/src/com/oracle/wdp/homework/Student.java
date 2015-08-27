package com.oracle.wdp.homework;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private transient School schoo;

	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public School getSchoo() {
		return schoo;
	}
	public void setSchoo(School schoo) {
		this.schoo = schoo;
	}
}
