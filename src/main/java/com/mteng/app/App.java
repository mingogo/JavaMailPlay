package com.mteng.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml");
		App app = (App) context.getBean("app");

		String username = app.getUsername();
		String password = app.getPassword();

		System.out.println("This is a test. " + username);
		System.out.println("This is a test. " + password);
	}
}