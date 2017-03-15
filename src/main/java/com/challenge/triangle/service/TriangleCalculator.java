package com.challenge.triangle.service;

import com.challenge.triangle.model.Triangle;
import org.springframework.stereotype.Service;

/**
 * Created by Samuel Aquino on 3/15/17.
 */
public interface TriangleCalculator {
    void determineTriangleType(Triangle triangle);
}
