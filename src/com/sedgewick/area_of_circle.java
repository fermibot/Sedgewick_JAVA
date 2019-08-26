package com.sedgewick;

public class area_of_circle {

    private static float randomReal(double min, double max) {
        return (float) (min + (Math.random() * (max - min)));
    }

    private static float radius(float xCoordinate, float yCoordinate) {
        return (float) Math.pow(Math.pow(xCoordinate, 2) + Math.pow(yCoordinate, 2), 0.5);
    }

    public static void main(String[] args) {
        for (int t = 0; t < 100; t++) {
            int within_circle = 0, max_points = 1000;
            double radius = 1.0, area_proportion, area_of_square, radius_square;
            area_of_square = Math.pow(2 * radius, 2);
            radius_square = Math.pow(radius, 2);
            for (int i = 0; i < max_points; i++) {
                if (radius(randomReal(-radius, radius), randomReal(-radius, radius)) <= radius_square) {
                    within_circle++;
                }
            }
            area_proportion = (area_of_square * within_circle) / max_points;
            System.out.println("Area of the radius = " + area_proportion);
        }
    }
}
