package com.sedgewick.math_objects;

public class BaseFunctions {
    public static int GCD(int u, int v) {
        int t;
        if (u != v) {
            while (u > 0) {
                if (u < v) {
                    t = u;
                    u = v;
                    v = t;
                }
                u = u - v;
            }
        }
        return v;
    }

    public static int GCD(int[] integers) {
        int gcd = 0;
        for (int i = 0; i < integers.length - 1; i++) {
            gcd = GCD(integers[i], integers[i + 1]);
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(GCD(10, 20));

        int intSize = 10;
        int[] integers = new int[intSize];
        for (int i = 0; i < intSize; i++) {
            integers[i] = i * 10;
        }
        System.out.println(GCD(integers));
    }
}
