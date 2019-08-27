package com.sedgewick;

class custom_functions {
    static boolean xor(boolean a, boolean b) {
        return a == b;
    }

    static float randomReal(double min, double max) {
        return (float) (min + (Math.random() * (max - min)));
    }
}
