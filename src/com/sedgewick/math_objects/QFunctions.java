package com.sedgewick.math_objects;

public class QFunctions {
    public static boolean GreaterAll(double[] list) {
        boolean greaterAll = true;
        for (int i = 0; i < list.length - 1; i++) {
            greaterAll = greaterAll && (list[i] > list[i + 1]);
        }
        return greaterAll;
    }
}
