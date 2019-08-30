package com.sedgewick.math_objects;

import static java.lang.Math.exp;

public class custom_functions {
    public static boolean xor(boolean a, boolean b) {
        return a == b;
    }

    public static float randomReal(double min, double max) {
        return (float) (min + (Math.random() * (max - min)));
    }

    public static double compound_interest(double principal, double rate_of_interest, int time) {
        return principal * exp(rate_of_interest * (double) time);
    }

    public static double wind_chill(double temperature, double wind_velocity) {
        return 35.74 + (0.6215 * temperature) + (((0.4275 * temperature) - 35.75) * Math.pow(wind_velocity, 0.16));
    }

}
