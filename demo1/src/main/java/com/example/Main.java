package com.example;

import com.example.bean.A;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		var cpxa = new ClassPathXmlApplicationContext("classpath:bean.xml");
		var bean = cpxa.getBean(A.class);
		System.err.println(bean.getName());
	}
}