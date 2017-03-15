package com.challenge.triangle.model;

import com.challenge.triangle.enums.TriangleType;

/**
 * Created by Samuel Aquino on 3/15/17.
 */
public class Triangle {
    private Double sideOne;
    private Double sideTwo;
    private Double sideThree;
    private Enum<TriangleType> type;

    public Triangle(){};

    public Triangle(Double sideOne, Double sideTwo, Double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public Double getSideOne() {
        return sideOne;
    }

    public Double getSideTwo() {
        return sideTwo;
    }

    public Double getSideThree() {
        return sideThree;
    }

    public Enum<TriangleType> getType() {
        return type;
    }

    public void setType(Enum<TriangleType> type) {
        this.type = type;
    }
}
