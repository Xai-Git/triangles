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
    public void determineTriangleType(Triangle triangle) {
        Double sideOne = triangle.getSideOne();
        Double sideTwo = triangle.getSideTwo();
        Double sideThree = triangle.getSideThree();
        if (sideOne.equals(sideTwo) && sideOne.equals(sideThree)) {
            triangle.setType(TriangleType.EQUILATERAL);
        } else if ((sideOne.equals(sideTwo) && !sideOne.equals(sideThree))
                || (sideTwo.equals(sideThree) && !sideTwo.equals(sideOne))
                || (sideThree.equals(sideOne) && !sideThree.equals(sideTwo))) {


        }
    }
}
