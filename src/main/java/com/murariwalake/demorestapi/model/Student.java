package com.murariwalake.demorestapi.model;

public class Student {
	private int id;
	private String name;
	private int age;

	//add setter and getter methods for all the fields
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}


}
