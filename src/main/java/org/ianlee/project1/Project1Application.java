package org.ianlee.project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project1Application {
	@Autowired
	private DataLoader loader;
	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}
	
}
