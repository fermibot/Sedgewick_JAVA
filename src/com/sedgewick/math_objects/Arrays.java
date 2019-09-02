package com.sedgewick.math_objects;

public class Arrays {
    public static double Max(double[] array) {
        double max = array[0];
        for (double element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public static double Min(double[] array) {
        double max = array[0];
        for (double element : array) {
            if (element < max) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        double[] array = {1, 2, 3, 5};
        System.out.println(Max(array));
        System.out.println(Min(array));
    }
}
