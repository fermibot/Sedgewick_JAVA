package com.sedgewick.math_objects;

import static com.sedgewick.math_objects.custom_functions.randomReal;

public class area_of_circle {


    private static float radius(float xCoordinate, float yCoordinate) {
        return (float) Math.pow(Math.pow(xCoordinate, 2) + Math.pow(yCoordinate, 2), 0.5);
    }

    private static float estimate_circle_area(double radius, int nPoints) {
        int within_circle = 0;
        double area_of_circle, area_of_square, radius_square;
        area_of_square = Math.pow(2 * radius, 2);
        radius_square = Math.pow(radius, 2);
        for (int i = 0; i < nPoints; i++) {
            if (radius(randomReal(-radius, radius), randomReal(-radius, radius)) <= radius_square) {
                within_circle++;
            }
        }
        area_of_circle = (area_of_square * within_circle) / nPoints;
        return (float) area_of_circle;
    }

    public static void main(String[] args) {
        for (int t = 0; t < 100; t++) {
            float area_of_circle = estimate_circle_area(1, 100);
            System.out.println("Estimated area of the circle (radius = 1 units) " + area_of_circle + " unit.sq");
        }
    }
}
