package com.challenge.triangle.service;

import com.challenge.triangle.enums.TriangleType;
import com.challenge.triangle.model.Triangle;
import org.springframework.stereotype.Service;

/**
 * Created by Samuel Aquino on 3/15/17.
 */
@Service
public class TriangleCalcuatorStrategy implements TriangleCalculator{

    @Override
    public boolean isValidTriangle(Double sideOne, Double sideTwo, Double sideThree) {
        return false;
    }

    private boolean checkSideInequality(Double hypotenuse, Double adjacent, Double opposite){
    }

    @Override
    public void determineTriangleType(Triangle triangle) {
        Double sideOne = triangle.getSideOne();
        Double sideTwo = triangle.getSideTwo();
        Double sideThree = triangle.getSideThree();
        if (isEqualateral(sideOne, sideTwo, sideThree)) {
            triangle.setType(TriangleType.EQUILATERAL);
        } else if (isIsosceles(sideOne, sideTwo, sideThree)) {
            triangle.setType(TriangleType.ISOSCELES);
        } else if (isScalene(sideOne, sideTwo, sideThree)) {
            triangle.setType(TriangleType.SCALENE);
        }
    }

    private boolean isEqualateral(Double sideOne, Double sideTwo, Double sideThree) {
        return sideOne.equals(sideTwo) && sideOne.equals(sideThree);
    }

    private boolean isIsosceles(Double sideOne, Double sideTwo, Double sideThree) {
        return (sideOne.equals(sideTwo))
                || (sideTwo.equals(sideThree))
                || (sideThree.equals(sideOne));
    }

    private boolean isScalene(Double sideOne, Double sideTwo, Double sideThree) {
        return !sideOne.equals(sideTwo) && !sideOne.equals(sideThree) && !sideTwo.equals(sideThree);
    }
}
