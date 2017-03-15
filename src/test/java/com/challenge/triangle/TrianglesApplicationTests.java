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
	public void triangleWithEqualSidesIsEqualateral() throws Exception {
		Triangle triangle = new Triangle(1.5d,1.5d,1.5d);
		triangleCalculator.determineTriangleType(triangle);
		assertEquals(TriangleType.EQUILATERAL, triangle.getType());
	}

	@Test
	public void triangleWithTwoEqualSidesIsIsosceles() throws Exception {
		Triangle triangle = new Triangle(1.5d, 1.5d, 3d);
		triangleCalculator.determineTriangleType(triangle);
		assertEquals(TriangleType.ISOSCELES, triangle.getType());

		Triangle secondTriangle = new Triangle(1.5d, 3d, 3d);
		triangleCalculator.determineTriangleType(secondTriangle);
		assertEquals(TriangleType.ISOSCELES, secondTriangle.getType());

		Triangle thirdTriangle = new Triangle(1.5d, 3d, 1.5d);
		triangleCalculator.determineTriangleType(thirdTriangle);
		assertEquals(TriangleType.ISOSCELES, thirdTriangle.getType());
	}

	@Test
	public void triangleWithNoEqualSidesIsScalene() throws Exception {
		Triangle triangle = new Triangle(1.5d, 3d, 4.5d);
		triangleCalculator.determineTriangleType(triangle);
		assertEquals(triangle.getType(), TriangleType.SCALENE);
	}

}
