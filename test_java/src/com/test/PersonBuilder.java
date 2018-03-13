package com.test;

public class PersonBuilder {
	private String name;
	private int age;
	
	public PersonBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public PersonBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	
	public Person build() {
		return new Person(this.name,this.age);
	}
	
	
}
