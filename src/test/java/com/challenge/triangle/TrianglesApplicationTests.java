package com.challenge.triangle;

import com.challenge.triangle.enums.TriangleType;
import com.challenge.triangle.model.Triangle;
import com.challenge.triangle.service.TriangleCalculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TrianglesApplicationTests {

	private TriangleCalculator triangleCalculator;

	@Autowired
	public void setTriangleCalculator(TriangleCalculator triangleCalculator) {
		this.triangleCalculator = triangleCalculator;
	}

	@Test
	public void triangleWithEqualSidesIsEqualateral() {
		Triangle triangle = new Triangle(1.5d,1.5d,1.5d);
		triangleCalculator.determineTriangleType(triangle);
		assertEquals(TriangleType.EQUILATERAL, triangle.getType());
	}

}
