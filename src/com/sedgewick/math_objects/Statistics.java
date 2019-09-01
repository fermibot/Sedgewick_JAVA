package com.sedgewick.math_objects;

public class Statistics {

    public static double Total(double[] sample) {
        double total = 0;
        for (double item :
                sample) {
            total += item;
        }
        return total;
    }

    public static double Mean(double[] sample) {
        return Total(sample) / sample.length;
    }
}
