package com.challenge.triangle.enums;

/**
 * Created by Samuel Aquino on 3/15/17.
 */
public enum TriangleType {
    EQUILATERAL, ISOSCELES, SCALENE, INVALID;

    @Override
    public String toString() {
        switch(this) {
            case EQUILATERAL: return "Equilateral";
            case ISOSCELES: return "Isosceles";
            case SCALENE: return "Scalene";
            case INVALID: return "not a valid Triangle";
            default: return "";
        }
    }
}
