package com.challenge.triangle.model;

/**
 * Created by Samuel Aquino on 3/15/17.
 */
public class Triangle {
    private Double sideOne;
    private Double sideTwo;
    private Double sideThree;
    private String type;

    public Triangle(){};

    public Triangle(Double sideOne, Double sideTwo, Double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }
}
