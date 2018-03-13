package com.test;

import java.util.HashMap;
import java.util.Map;

public class Excute {
	public static void main(String[] args) {
		Person p = new PersonBuilder().setAge(30).setName("aaa").build();
		System.out.println(p);
	}
}
