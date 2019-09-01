package com.sedgewick.math_objects;

import static java.lang.Math.random;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import static java.lang.Math.log;
import static java.lang.Math.sin;

public class RandomFunctions {

    public static double[] RandomGaussian(int sampleSize) {
        double[] sample = new double[sampleSize];
        for (int i = 0; i < sampleSize; i++) {
            sample[i] = sin(2 * PI * random()) * sqrt(-2 * log(random()));
        }
        return sample;
    }

    public static double RandomGaussian() {
        return RandomGaussian(1)[0];
    }
}
