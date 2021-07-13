package com.solutions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SolutionsApplication implements CommandLineRunner {
	@Autowired
	ConfigurableApplicationContext context;
	public static void main(String[] args) {
		SpringApplication.run(SolutionsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		StringUtils.stringManupulation("Hi");
		System.exit(SpringApplication.exit(context));
		
	}

}
