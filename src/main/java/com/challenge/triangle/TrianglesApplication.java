package com.challenge.triangle;

import com.challenge.triangle.model.Triangle;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrianglesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TrianglesApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		Triangle triangle = new Triangle();
	}
}
