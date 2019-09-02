package com.sedgewick.math_objects;

import javax.swing.*;

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

    public static void EratosthenesPrimes(int N) {
        int i, j;
        int[] a = new int[N + 1];
        for (a[1] = 0, i = 2; i <= N; i++) a[i] = 1;
        for (i = 2; i <= N / 2; i++) {
            for (j = 2; j <= N / i; j++) {
                a[i * j] = 0;
            }
        }
        for (i = 1; i <= N; i++) {
            if (a[i] == 1) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        EratosthenesPrimes(1000);
    }
}
