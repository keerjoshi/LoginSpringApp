package com.loginapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class LoginWebApplication {
	
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(LoginWebApplication.class);
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SpringApplicationBuilder(LoginWebApplication.class).web(true).run(args);

	}

}
