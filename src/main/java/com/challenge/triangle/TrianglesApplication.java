package com.challenge.triangle;

import com.challenge.triangle.model.Triangle;
import com.challenge.triangle.service.TriangleCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrianglesApplication implements CommandLineRunner {

	private TriangleCalculator triangleCalculator;

	@Autowired
	public void setTriangleCalculator(TriangleCalculator triangleCalculator) {
		this.triangleCalculator = triangleCalculator;
	}

	public static void main(String[] args) {
		SpringApplication.run(TrianglesApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		if(strings.length == 3) {
			Triangle triangle = new Triangle(Double.valueOf(strings[0]), Double.valueOf(strings[1]),
					Double.valueOf(strings[2]));
			triangleCalculator.determineTriangleType(triangle);
		} else {
			System.out.print("There was either no input or an incorrect number of inputs.\n" +
					"Please run the program again with 3 inputs.");
		}
	}
}
